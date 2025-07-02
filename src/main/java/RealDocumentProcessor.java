public class RealDocumentProcessor implements DocumentProcessorService {
    private final Subject subject = new DocumentProcessorObservable();

    public RealDocumentProcessor() {
        subject.addObserver(new EmailNotifier());
        subject.addObserver(new SlackNotifier());
    }

    @Override
    public void processDocument(DocumentJob job) {
        DocumentReaderFactory factory = new LocalFileReaderFactory();
        DocumentReader reader = factory.createReader();

        AbstractDocumentFlow flow = new LocalFileFlow(reader);
        flow.run(job);

        Command billing = new BillingCommand(job.getRequestingUser(), job.getOutputFormat());
        billing.execute();

        subject.notifyObservers("El documento fue procesado correctamente para: " + job.getUserEmail());
    }
}

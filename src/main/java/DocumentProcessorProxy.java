public class DocumentProcessorProxy implements DocumentProcessorService {
    private final RealDocumentProcessor realProcessor = new RealDocumentProcessor();

    @Override
    public void processDocument(DocumentJob job) {
        if (job.isHighPriority() && !"Premium".equals(job.getRequestingUser().getPlan())) {
            System.out.println("Acceso denegado: Solo usuarios Premium pueden usar alta prioridad.");
            return;
        }
        realProcessor.processDocument(job);
    }
}

public class LocalFileFlow extends AbstractDocumentFlow {
    private final DocumentReader reader;

    public LocalFileFlow(DocumentReader reader) {
        this.reader = reader;
    }

    @Override
    protected byte[] fetchDocument(DocumentJob job) {
        return reader.read(job.getSourceFilePath());
    }
}


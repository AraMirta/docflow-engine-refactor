public class LocalFileReaderFactory extends DocumentReaderFactory {
    @Override
    public DocumentReader createReader() {
        return new LocalFileReader();
    }
}
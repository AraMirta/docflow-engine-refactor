public class MainDocFlowApp {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Mirta.dev");
        user.setPlan("Premium");

        DocumentJob job = new DocumentJob(
                "documentos/archivo.docx",
                "PDF",
                "Privado",
                true,
                user
        );
        job.setUserEmail("mirta@gmail.com");

        DocumentProcessorService processor = new DocumentProcessorProxy();
        processor.processDocument(job);
    }
}

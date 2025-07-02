public abstract class AbstractDocumentFlow {
    public final void run(DocumentJob job) {
        byte[] file = fetchDocument(job);
        if (!validate(job, file)) return;
        byte[] converted = convert(job, file);
        store(converted);
    }

    protected abstract byte[] fetchDocument(DocumentJob job);

    protected boolean validate(DocumentJob job, byte[] file) {
        System.out.println("✅ Validando...");
        return true;
    }

    protected byte[] convert(DocumentJob job, byte[] file) {
        System.out.println("🔄 Convirtiendo a " + job.getOutputFormat());
        return new byte[120];
    }

    protected void store(byte[] file) {
        System.out.println("💾 Guardando archivo en sistema externo...");
    }
}


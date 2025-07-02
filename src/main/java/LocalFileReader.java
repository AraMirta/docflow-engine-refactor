public class LocalFileReader implements DocumentReader {
    @Override
    public byte[] read(String sourcePath) {
        System.out.println("📂 Leyendo archivo desde " + sourcePath);
        return new byte[100]; // Simulado
    }
}

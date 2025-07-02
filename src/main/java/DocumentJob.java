public class DocumentJob {
    private final String sourceFilePath;
    private final String outputFormat;
    private final String watermarkText;
    private final boolean highPriority;
    private String userEmail;
    private final User requestingUser;

    public DocumentJob(String source, String format, String watermark, boolean priority, User user) {
        this.sourceFilePath = source;
        this.outputFormat = format;
        this.watermarkText = watermark;
        this.highPriority = priority;
        this.requestingUser = user;
    }

    // Getters y Setters
    public String getSourceFilePath() { return sourceFilePath; }
    public String getOutputFormat() { return outputFormat; }
    public String getWatermarkText() { return watermarkText; }
    public boolean isHighPriority() { return highPriority; }
    public User getRequestingUser() { return requestingUser; }
    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
}

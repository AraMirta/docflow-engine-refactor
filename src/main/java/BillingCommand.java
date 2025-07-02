public class BillingCommand implements Command {
    private final User user;
    private final String format;

    public BillingCommand(User user, String format) {
        this.user = user;
        this.format = format;
    }

    @Override
    public void execute() {
        System.out.println("💲 Facturando al usuario " + user.getUsername() + " por formato " + format);
    }
}
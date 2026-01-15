package act7;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {

    private final String messageText;
    private final double balance;
    private final double requestedAmount;

    public InsufficientFundsException(String message, double balance, double requestedAmount) {
        super(message);
        this.messageText = message;
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public String getMessageText() { return messageText; }
    public double getBalance() { return balance; }
    public double getRequestedAmount() { return requestedAmount; }

    public static String peso(double amount) {
        return "₱" + amount;
    }
	
}

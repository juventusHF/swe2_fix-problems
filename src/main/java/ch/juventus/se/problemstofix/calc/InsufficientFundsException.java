package ch.juventus.se.problemstofix.calc;

/**
 * @author: Linda Krüger
 * @since: 21.09.17
 */
public class InsufficientFundsException extends Exception {

    private double amount;

    public InsufficientFundsException (double amount) {
        super();
        this.amount = amount;
    }

    public InsufficientFundsException (double amount, String message) {
        super(message);
        this.amount = amount;
    }

    public InsufficientFundsException (double amount, Throwable cause) {
        super(cause);
        this.amount = amount;
    }

    public InsufficientFundsException (double amount, String message, Throwable cause) {
        super(message, cause);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

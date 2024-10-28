package src.exception;

public class InsufficientTicketsException extends Exception {
    public InsufficientTicketsException(String message) {
        super(message);
    }
}
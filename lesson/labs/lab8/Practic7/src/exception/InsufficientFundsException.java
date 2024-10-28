package exception;

import javax.smartcardio.Card;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(Card card) {
        super(message);
    }
}

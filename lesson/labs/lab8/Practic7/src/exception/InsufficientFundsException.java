package src.exception;

import src.Card;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(Card card, int creditsRequired) {
        super("На карте " + card.getCardId() +
                " недостаточно средств для игры. \nТекущий баланс: " +
                card.getCreditBalance() +
                ", для игры необходимо: " + creditsRequired) ;
    }
}

package src;

public class Card {

    public Card(int creditBalance, int ticketBalance) {
        this.cardId = cardIncrement++;
        this.creditBalance = creditBalance;
        this.ticketBalance = ticketBalance;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        // не может быть отрицательным
        this.creditBalance = creditBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    public void setTicketBalance(int ticketBalance) {
        // не может быть отрицательным
        this.ticketBalance = ticketBalance;
    }

    private int cardId; // Уникальный идентификационный номер карты
    private int creditBalance; // Баланс кредитов
    private int ticketBalance; // Баланс билетов

    static private int cardIncrement=1;
}

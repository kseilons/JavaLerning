package src;

import src.exception.InsufficientFundsException;

import java.util.Random;

public class Game {
    private final int creditsRequired; // Требуемое количество кредитов для игры
    private final Random random;

    public Game(int creditsRequired) {
        this.creditsRequired = creditsRequired;
        this.random = new Random();
    }

    public void playGame(Card card) throws InsufficientFundsException {
        // Проверяем, достаточно ли кредитов на карте
        if (card.getCreditBalance() < creditsRequired) {
            throw new InsufficientFundsException(card, creditsRequired);
        }

        payGames(card, creditsRequired);

        int ticketsWon = random.nextInt(10) + 1;

        // Обновляем баланс билетов на карте
        updateTicketBalance(card, ticketsWon);

        // Выводим информацию
        System.out.println("Карточка номер " + card.getCardId() +
                " выиграла " + ticketsWon + " билетов.");
        System.out.println("Новая итоговая сумма кредитов: " + card.getCreditBalance());
        System.out.println("Новая итоговая сумма билетов: " + card.getTicketBalance());
    }

    private void payGames(Card card, int creditsRequired) {
        card.setCreditBalance(card.getCreditBalance() - creditsRequired);
    }

    private void updateTicketBalance(Card card, int ticketsWon) {
        card.setTicketBalance(card.getTicketBalance() + ticketsWon);
    }
}

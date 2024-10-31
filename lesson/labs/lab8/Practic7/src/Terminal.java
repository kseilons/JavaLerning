package src;

import src.exception.InsufficientTicketsException;
import src.exception.PrizeUnavailableException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Terminal {
    private final List<PrizeCategory> prizeCategories;
    private Random random;

    public Terminal() {
        // Инициализация категорий призов.  Можно добавить больше призов
        this.prizeCategories = new ArrayList<>();
        prizeCategories.add(new PrizeCategory("Плюшевый мишка", 50, 10));
        prizeCategories.add(new PrizeCategory("Кофемашина", 200, 5));
        prizeCategories.add(new PrizeCategory("Сертификат в кино", 100, 7));
        this.random = new Random();
    }

    public List<PrizeCategory> getPrizeCategories() {
        return prizeCategories;
    }

    public void loadCredits(Card card, int rubles) {
        int creditsToAdd = rubles * 2;
        card.setCreditBalance(card.getCreditBalance() + creditsToAdd);
        System.out.println("На карту №" + card.getCardId() + " добавлено " + creditsToAdd + " кредитов.");
        displayBalance(card);
    }

    public void transferCredits(Card sourceCard, Card destinationCard, int creditsToTransfer) {
        if (sourceCard.getCreditBalance() < creditsToTransfer) {
            System.out.println("Недостаточно кредитов на карте №" + sourceCard.getCardId());
            return;
        }
        sourceCard.setCreditBalance(sourceCard.getCreditBalance() - creditsToTransfer);
        destinationCard.setCreditBalance(destinationCard.getCreditBalance() + creditsToTransfer);
        System.out.println("Переведено " + creditsToTransfer + " кредитов с карты №" + sourceCard.getCardId() + " на карту №" + destinationCard.getCardId());
        displayBalance(sourceCard);
        displayBalance(destinationCard);
    }

    public void transferTickets(Card sourceCard, Card destinationCard, int ticketsToTransfer) {
        if (sourceCard.getTicketBalance() < ticketsToTransfer) {
            System.out.println("Недостаточно билетов на карте №" + sourceCard.getCardId());
            return;
        }
        sourceCard.setTicketBalance(sourceCard.getTicketBalance() - ticketsToTransfer);
        destinationCard.setTicketBalance(destinationCard.getTicketBalance() + ticketsToTransfer);
        System.out.println("Переведено " + ticketsToTransfer + " билетов с карты №" + sourceCard.getCardId() + " на карту №" + destinationCard.getCardId());
        displayBalance(sourceCard);
        displayBalance(destinationCard);
    }

    public void claimPrize(Card card, String prizeName) throws PrizeUnavailableException, InsufficientTicketsException {
        PrizeCategory prizeCategory = findPrizeCategory(prizeName);
        if (prizeCategory == null) {
            throw new PrizeUnavailableException("Приза '" + prizeName + "' нет в терминале.");
        }
        if (card.getTicketBalance() < prizeCategory.getTicketsRequired()) {
            throw new InsufficientTicketsException("Недостаточно билетов на карте №" + card.getCardId() + " для получения приза '" + prizeName + "'.");
        }

        if (prizeCategory.claimPrize(card.getTicketBalance())) {
            card.setTicketBalance(card.getTicketBalance() - prizeCategory.getTicketsRequired());
            System.out.println("Приз '" + prizeName + "' получен! Осталось " + prizeCategory.getPrizesRemaining() + " таких призов.");
            displayBalance(card);
        } else {
            throw new PrizeUnavailableException("Приз '" + prizeName + "' закончился.");
        }
    }


    private PrizeCategory findPrizeCategory(String prizeName) {
        for (PrizeCategory category : prizeCategories) {
            if (category.getPrizeName().equalsIgnoreCase(prizeName)) {
                return category;
            }
        }
        return null;
    }

    public void displayBalance(Card card) {
        System.out.println("Баланс карты №" + card.getCardId() + ": Кредиты - " + card.getCreditBalance() + ", Билеты - " + card.getTicketBalance());
    }
}
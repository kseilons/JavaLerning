package src;

import src.exception.InsufficientFundsException;
import src.exception.InsufficientTicketsException;
import src.exception.PrizeUnavailableException;

import java.util.List;
import java.util.Scanner;

public class Test {
    private static final Terminal terminal = new Terminal();
    private static final Card card1 = new Card(1, 0, 0);
    private static final Card card2 = new Card(2, 0, 0);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Загрузить кредиты на карту");
            System.out.println("2. Сыграть в игру");
            System.out.println("3. Перенести баланс кредитов с одной карты на другую");
            System.out.println("4. Перенести билеты с одной карты на другую");
            System.out.println("5. Запросить приз");
            System.out.println("6. Показать баланс карты");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    loadCreditsScenario(scanner);
                    break;
                case 2:
                    playGameScenario(scanner);
                    break;
                case 3:
                    transferCreditsScenario(scanner);
                    break;
                case 4:
                    transferTicketsScenario(scanner);
                    break;
                case 5:
                    claimPrizeScenario(scanner);
                    break;
                case 6:
                    displayBalanceScenario(scanner);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void loadCreditsScenario(Scanner scanner) {
        System.out.println("Введите номер карты (1 или 2):");
        int cardNumber = scanner.nextInt();
        System.out.println("Введите сумму (в рублях) для загрузки кредитов:");
        int rubles = scanner.nextInt();

        Card selectedCard = (cardNumber == 1) ? card1 : card2;
        terminal.loadCredits(selectedCard, rubles);
    }

    private static void playGameScenario(Scanner scanner) {
        System.out.println("Введите номер карты (1 или 2):");
        int cardNumber = scanner.nextInt();

        Game game = new Game(20);
        Card selectedCard = (cardNumber == 1) ? card1 : card2;

        try {
            game.playGame(selectedCard);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void transferCreditsScenario(Scanner scanner) {
        System.out.println("Введите номер исходной карты (1 или 2):");
        int fromCardNumber = scanner.nextInt();
        System.out.println("Введите номер карты назначения (1 или 2):");
        int toCardNumber = scanner.nextInt();
        System.out.println("Введите сумму кредитов для переноса:");
        int credits = scanner.nextInt();

        Card sourceCard = (fromCardNumber == 1) ? card1 : card2;
        Card destinationCard = (toCardNumber == 1) ? card1 : card2;

        terminal.transferCredits(sourceCard, destinationCard, credits);
    }

    private static void transferTicketsScenario(Scanner scanner) {
        System.out.println("Введите номер исходной карты (1 или 2):");
        int fromCardNumber = scanner.nextInt();
        System.out.println("Введите номер карты назначения (1 или 2):");
        int toCardNumber = scanner.nextInt();
        System.out.println("Введите количество билетов для переноса:");
        int tickets = scanner.nextInt();

        Card sourceCard = (fromCardNumber == 1) ? card1 : card2;
        Card destinationCard = (toCardNumber == 1) ? card1 : card2;

        terminal.transferTickets(sourceCard, destinationCard, tickets);
    }

    private static void claimPrizeScenario(Scanner scanner) {
        System.out.println("Введите номер карты (1 или 2):");
        int cardNumber = scanner.nextInt();
        List<PrizeCategory> prizes =terminal.getPrizeCategories();
        for (PrizeCategory prize : prizes) {
            System.out.println("Название приза: " + prize.getPrizeName() +
                    ", Требуемые билеты: " + prize.getTicketsRequired() +
                    ", Доступное количество: " + prize.getPrizesRemaining());
        }

        System.out.println("Введите имя приза:");
        scanner.nextLine();
        String prizeName = scanner.nextLine();

        Card selectedCard = (cardNumber == 1) ? card1 : card2;

        try {
            terminal.claimPrize(selectedCard, prizeName);
        } catch (PrizeUnavailableException | InsufficientTicketsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayBalanceScenario(Scanner scanner) {
        System.out.println("Введите номер карты (1 или 2):");
        int cardNumber = scanner.nextInt();

        Card selectedCard = (cardNumber == 1) ? card1 : card2;
        terminal.displayBalance(selectedCard);
    }

}
package src;

import src.exception.InsufficientFundsException;

public class Test {

    public static void main(String[] args) {
        // Пример использования
        Card card = new Card(123456, 20, 5); // создаем карту
        Game machine = new Game(5); // создаем игровой автомат, требующий 5 кредитов

        try {
            machine.playGame(card);
            machine.playGame(card);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

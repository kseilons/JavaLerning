package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI extends JFrame {

    private static final Terminal terminal = new Terminal();
    private static final Card card1 = new Card(0, 0);
    private static final Card card2 = new Card(0, 0);

    private JTextField cardNumberField;
    private JTextField amountField;
    private JTextField prizeNameField;
    private JTextField transferAmountField;
    private JTextField transferTicketsField;
    private JTextArea outputArea;


    public TestGUI() {
        setTitle("Игровой терминал");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Панель меню
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Действия");
        JMenuItem loadCreditsItem = new JMenuItem("Загрузить кредиты");
        JMenuItem playGameItem = new JMenuItem("Сыграть в игру");
        JMenuItem transferCreditsItem = new JMenuItem("Перенести кредиты");
        JMenuItem transferTicketsItem = new JMenuItem("Перенести билеты");
        JMenuItem claimPrizeItem = new JMenuItem("Запросить приз");
        JMenuItem displayBalanceItem = new JMenuItem("Показать баланс");
        JMenuItem exitItem = new JMenuItem("Выход");

        menu.add(loadCreditsItem);
        menu.add(playGameItem);
        menu.add(transferCreditsItem);
        menu.add(transferTicketsItem);
        menu.add(claimPrizeItem);
        menu.add(displayBalanceItem);
        menu.add(exitItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);


        // Панель ввода
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(new JLabel("Номер карты (1 или 2):"));
        cardNumberField = new JTextField();
        inputPanel.add(cardNumberField);
        inputPanel.add(new JLabel("Сумма/Количество:"));
        amountField = new JTextField();
        inputPanel.add(amountField);
        inputPanel.add(new JLabel("Название приза:"));
        prizeNameField = new JTextField();
        inputPanel.add(prizeNameField);
        inputPanel.add(new JLabel("Перенос кредитов:"));
        transferAmountField = new JTextField();
        inputPanel.add(transferAmountField);
        inputPanel.add(new JLabel("Перенос билетов:"));
        transferTicketsField = new JTextField();
        inputPanel.add(transferTicketsField);

        add(inputPanel, BorderLayout.NORTH);

        // Область вывода
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);

        // Обработчики событий (пример для загрузки кредитов)
        loadCreditsItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int cardNumber = Integer.parseInt(cardNumberField.getText());
                    int rubles = Integer.parseInt(amountField.getText());
                    Card selectedCard = (cardNumber == 1) ? card1 : card2;
                    terminal.loadCredits(selectedCard, rubles);
                    outputArea.append("Кредиты успешно загружены.\n");
                } catch (Exception ex) {
                    outputArea.append("Ошибка: " + ex.getMessage() + "\n");
                }
            }
        });

        // ... аналогичные обработчики для остальных пунктов меню ...

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestGUI();
            }
        });
    }
}

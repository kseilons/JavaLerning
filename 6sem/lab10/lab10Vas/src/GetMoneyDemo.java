import static javax.swing.JOptionPane.*;

class GetMoneyDemo {
    public static void main(String[] args) {
        String name;
        double m, r, val;
        int t;

        try {
            // Получение аргументов
            name = args[0] + " " + args[1];
            m = Double.parseDouble(args[2]);
            r = Double.parseDouble(args[3]);
            t = Integer.parseInt(args[4]);

            // Расчёт суммы
            val = m;
            for(int k = 1; k <= t; k++) {
                val *= (1 + r/100);
            }
            val = ((int)(100 * val)) / 100.0;

            // Формирование результата
            String txt = "Имя: " + name + "\n";
            txt += "Вклад: " + m + "\n";
            txt += "Ставка: " + r + "\n";
            txt += "Время: " + t + "\n";
            txt += "Итог: " + val;

            // Вывод результата
            showMessageDialog(null, txt, "Итоговая сумма по депозиту", INFORMATION_MESSAGE);
        }
        catch(Exception e) {
            showMessageDialog(null, "Неверно указаны параметры!\n" + e, "Ошибка", ERROR_MESSAGE);
        }
    }
}
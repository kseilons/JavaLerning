public class Bond {
    String name;
    double balance, rate;
    int term, monthsRemaining;

    void setTermAndRate(int t){
        if (t >= 0 && t < 12) rate = 0.005;
        else if (t >= 12 && t < 24) rate = 0.01;
        else if (t >= 24 && t < 36) rate = 0.015;
        else if (t >= 36 && t < 48) rate = 0.02;
        else if (t >= 48 && t < 60) rate = 0.025;
        else {
            System.out.println("Недопустимый срок");
            t = 0;
        }
        term = t;
        monthsRemaining = t;
    }

    void earnInterest(){
        if (monthsRemaining > 0) {
            balance += balance * rate / 12;
            monthsRemaining--;
            System.out.println("Баланс: " + balance);
            System.out.println("Ставка: " + rate);
            System.out.println("Остаток месяцев: " + monthsRemaining);
        }
        else System.out.println("Срок платежа облигации наступил");
    }
}

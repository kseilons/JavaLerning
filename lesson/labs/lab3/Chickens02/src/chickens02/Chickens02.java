
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        int mondayEggs = 100;
        int tuesdayEggs = 121;
        int wednesdayEggs = 117;

        int numbOfDays = 3;
        // Вычисление среднего количества яиц в день
        double dailyAverage = (mondayEggs + tuesdayEggs + wednesdayEggs) / (double) numbOfDays;
        
        // Вычисление ожидаемого количества яиц на 30-й день
        double monthlyAverage = dailyAverage * 30;
        
        // Вычисление общей месячной прибыли
        double eggPrice = 0.18;
        double monthlyProfit = monthlyAverage * eggPrice;
        
        System.out.printf("Daily Average:   %.3f%n", dailyAverage);
        System.out.printf("Monthly Average: %.2f%n", monthlyAverage);
        System.out.printf("Monthly Profit:  $%.2f%n", monthlyProfit);
    }
}
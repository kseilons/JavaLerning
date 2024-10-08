
package tip04;

public class Calculator {
    public double tax = .05;
    public double tip = .15;

    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public double findTotal(double price, String name){
        double common_price = (15 + 30) * (1 + tax + tip) / 6;
        double total = price*(1+tax+tip) + common_price;
        System.out.println(name +": $" +total);
        return total;
    }
}

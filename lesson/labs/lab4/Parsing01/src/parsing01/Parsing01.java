package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        String shirtPrice = "15", taxRate = "0.05", gibberish = "dfasdvkmcxv;lkzmd;jklj";

        int shirtPriceInt = Integer.parseInt(shirtPrice);
        double taxRateDouble = Double.parseDouble(taxRate);
        double shirtTax = shirtPriceInt * taxRateDouble;
        System.out.println(shirtTax);

        int taxRateInt = Integer.parseInt(taxRate);
        int gibberishInt = Integer.parseInt(gibberish);
    }
}

package shoppingcart02;

public class CartItem {
    String title;
    double price;
    double tax;
    double totalPrice;
    int quantity;

    CartItem(String title, double price, double tax, int quantity) {
        this.title = title;
        this.price = price;
        this.tax = tax;
        this.quantity = quantity;
        this.totalPrice = (1 + tax) * price * quantity;
    }
}
package shoppingcart02;

public class CartItem {
    // Строковая переменная для названия товара
    String title;
    // Числовая переменная для цены товара
    double price;
    // Числовая переменная для налога на товар
    double tax; 
    // Числовая переменная для общей стоимости товара
    double totalPrice; 
    // Числовая переменная для количества товара
    int quantity;

    CartItem(String title, double price, double tax, int quantity) {
        this.title = title;
        this.price = price;
        this.tax = tax;
        this.quantity = quantity;
        // Расчет общей стоимости товара с учетом налога и количества
        this.totalPrice = (1 + tax) * price * quantity;
    }
}
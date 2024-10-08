
package shoppingcart02;

import java.util.ArrayList;

public class ShoppingCart02 {
    private final ArrayList<CartItem> items;
    String custName;

    public ShoppingCart02(String custName) {
        this.items = new ArrayList<>();
        this.custName = custName;
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void printShoppingCart() {
        String message = custName + " хочет купить:";
        System.out.println(message);

        double totalPrice = 0;
        for (CartItem item : items) {
            System.out.println(item.title + " - " + item.quantity + " шт.");
            totalPrice += item.totalPrice;
        }

        System.out.println("Общая стоимость: " + totalPrice);
    }

    public static void main(String[] args) {
        // Создание строковой переменной для имени покупателя
        String custName = "Алексей";

        // Создание объекта класса ShoppingCart02 с именем покупателя
        ShoppingCart02 cart = new ShoppingCart02(custName);

        // Создание объектов класса CartItem для различных товаров
        CartItem shirt = new CartItem("Рубашка", 125, 0.2, 2);
        CartItem pants = new CartItem("Брюки", 80, 0.1, 1);
        CartItem shoes = new CartItem("Ботинки", 150, 0.15, 1);

        
        // Добавление товаров в корзину
        cart.addItem(shirt);
        cart.addItem(pants);
        cart.addItem(shoes);

        
        // Вывод содержимого корзины
        cart.printShoppingCart();
    } 
}

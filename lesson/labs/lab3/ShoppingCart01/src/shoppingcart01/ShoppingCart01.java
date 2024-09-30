
package shoppingcart01;

public class ShoppingCart01 {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName = "Алекс";
        String itemDesc = "рубашку";
        String message;

        // Assign the message variable 
        // До этого момента использовать переменную message нельзя, мы ее еще не инициализировали
        message = custName + " хочет купить " + itemDesc + ".";

        // Print and run the code
        System.out.println(message);
    }
}

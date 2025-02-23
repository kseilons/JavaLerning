public class BakeryDriver {
    public static void main(String[] args) {
        Cookie chocolateChip = new Cookie("Chocolate Chip", 1.50);
        Cookie oatmealRaisin = new Cookie("Oatmeal Raisin", 1.75);
        Cookie peanutButter = new Cookie("Peanut Butter", 2.00);

        System.out.println("Первый печенье:");
        System.out.println("Тип: " + chocolateChip.getType());
        System.out.println("Цена: $" + chocolateChip.getPrice());
        System.out.println("Отдел: " + chocolateChip.getDepartment());
        System.out.println("Имя товара: " + chocolateChip.getItemName());
        
        System.out.println("\nВторое печенье:");
        System.out.println("Тип: " + oatmealRaisin.getType());
        System.out.println("Цена: $" + oatmealRaisin.getPrice());
        System.out.println("Отдел: " + oatmealRaisin.getDepartment());
        System.out.println("Имя товара: " + oatmealRaisin.getItemName());
        
        System.out.println("\nТретье печенье:");
        System.out.println("Тип: " + peanutButter.getType());
        System.out.println("Цена: $" + peanutButter.getPrice());
        System.out.println("Отдел: " + peanutButter.getDepartment());
        System.out.println("Имя товара: " + peanutButter.getItemName());

        chocolateChip.setPrice(1.60);
        System.out.println("\nЦена шоколадного печенья изменена:");
        System.out.println("Новая цена: $" + chocolateChip.getPrice());
    }
}

package ex;

public class Ex6 {
	public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello, world!");
        
        //переворачиваем текст с помощью метода reverse() класса StringBuilder
        text.reverse();
        
        System.out.println("Перевёрнутый текст: " + text);
    }
}

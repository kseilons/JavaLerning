
package casting01;

public class Casting01 {
    public static void main(String[] args) {
        byte b = (byte) 128;
        System.out.println(b);

        short s = 69;

        System.out.println((byte) s);

        byte a = 127;
        System.out.println(++a);
        System.out.println(++a);
    }    
}

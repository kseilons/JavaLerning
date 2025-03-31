package stringExample;

public class StringVsBuilder {
    public static void main(String[] args) {
        StringBuilder first = new StringBuilder("Test immutability");
        String second = "Test immutability";

        System.out.println("String: " + second.hashCode());
        System.out.println("StringBuilder: " + first.hashCode());
        
        first.replace(0, first.length(), "Hello world");
        second = "Hello world";
        
        System.out.println("StringBuilder: " + first.hashCode());
        System.out.println("String: " + second.hashCode());
        
    }
}
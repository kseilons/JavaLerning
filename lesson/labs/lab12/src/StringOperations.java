public class StringOperations {

    public static void main(String[] args) {
        // Объявляем и инициализируем переменные
        String str1 = "Hello";
        String str2 = "Alex";
        String str3;

        str3 = "You are " + str2;

        System.out.println("Welcome: " + str3);

        System.out.println("Length of str1: " + str1.length());

        System.out.println("Substring of str1 (0 to 5): " + str1.substring(0, 5));

        System.out.println("str2 in uppercase: " + str2.toUpperCase());

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are the same.");
        } else {
            int comparison = str1.compareTo(str2);
            if (comparison < 0) {
                System.out.println("str1 comes before str2 in lexicographical order.");
            } else {
                System.out.println("str1 comes after str2 in lexicographical order.");
            }
        }

        System.out.println("Are str1 and str2 the same (ignoring case)? " + str1.equalsIgnoreCase(str2));

    }
}




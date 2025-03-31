package stringExample;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Learning java with oracle");
        
        System.out.println("string = " + str);
        
        System.out.println("The length of the text is: " + str.length());
        System.out.println("The character at the beginning is: "
        + str.charAt(0));
        System.out.println("The second character is: " + str.charAt(1));
        System.out.println("The position of the start of the text \"acl\" is: "
        + str.indexOf("acl"));
        System.out.println("The following text is included within the String: "
        + str.substring(1,4));

        System.out.println("reverse = " + str.reverse());
        System.out.println("reverse = " + str.reverse());
        
        
        str.append(" is fun");
        System.out.println("Appended String = " + str);

        str.delete(8, 13);
        System.out.println("Deleted String = " + str);

        str.insert(8, " Java Programming");
        System.out.println("Inserted String = " + str);

        str.replace(13, 25, " String processing");
        System.out.println("Replaced String = " + str);
    
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("Q"));
        System.out.println(str.indexOf("a", 7));
    }
    

}

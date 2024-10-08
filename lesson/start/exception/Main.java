package start.exception;

public class Main {
    public static void main(String[] args) throws Exception{
        new Main().someMethod2();
        // System.out.println();
    }

    String someMethod(){
        try {
            Object o = null;
            System.out.println("try");
            // o.hashCode();
            throw new MyException();
            // return "try2";
        } catch (NullPointerException e) {
            System.out.println("catch");
            e.printStackTrace();
            return "catch2";
        } catch (MyException e) {

        } finally {
            System.out.println("finally");
        }
        return "hello";
    }
    void someMethod2() {

        try {
            
        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (RuntimeException e) {
            
        }
        //checked
        // throw new Throwable();
        // throw new Exception();
        // throw new IOException();
        //unchecked
        // throw new Error();
        // throw new RuntimeException();
        
        
         
        // throw new IOException("sdf");

        // try {
        //     throw new IOException("sdf");
        // } catch (IOException e) {

        //     System.out.println(e.getMessage());
        // }
        // throw new RuntimeException();
    }
}

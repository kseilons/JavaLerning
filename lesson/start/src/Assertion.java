package start.src;

public class Assertion {
    public static void main(String[] args) {
        new Assertion().someMethod(-5);
    }

    private void someMethod(int a ) {
        assert (a > 0);
        System.out.println(a);
    } 
}

//  java -ea start.src.Assertion
// java start.src.Assertion
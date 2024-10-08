package start.several_package.one;

public class TestClass {
    private int i = 5;
    protected int j = 6;
    int k = 7;
    public int m = 8;
    protected void method() {
        TestClass testClass = new TestClass();
        testClass.i = 10;
        
    }

}


class TestModifiers {
    void method() {
        TestClass testClass = new TestClass();
        testClass.j = 210;
        System.out.println(testClass.j);

    }
}

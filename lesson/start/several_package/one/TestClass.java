package start.several_package.one;

 class TestClass {
    private int i = 5;
    protected int j = 6;
    int ku = 5;
    int k = 7;
    public int m = 8;
    protected void method() {
        TestClass testClass = new TestClass();
        testClass.i = 10;
        
    }

}


public class TestModifiers extends TestClass {
    void method() {
        TestClass testClass = new TestClass();
        testClass.j = 210;
        System.out.println(testClass.j);

    }
}

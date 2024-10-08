package start.several_package.two;

import start.several_package.one.TestClass;

public class OtherClass extends TestClass {
    
    protected void method() {
        OtherClass otherClass = new OtherClass();
        System.out.println(otherClass.m);
    }
}

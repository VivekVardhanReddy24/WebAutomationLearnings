package Java_OOPS_Concepts;

import org.junit.Test;

public class AT11_AbstractClassImpl extends AT10_AbstractClass {
    @Test
    public void method1(){
        System.out.println("Abstract class method is implemented here or overiden");
    }

    @Test
    public void result(){
        AT11_AbstractClassImpl obj = new AT11_AbstractClassImpl();


        //obj.sum(10,20);
    }
}

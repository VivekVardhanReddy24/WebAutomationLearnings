package Java_OOPS_Concepts;

import org.junit.Test;

public class AT07_Inheritance {

    @Test
    public void meth4(){
        AT06InheritanceChild obj = new AT06InheritanceChild();
        obj.meth1();
        obj.meth2(); // meth2 -overidden meth is accessed from child.
        obj.method3();

    }

    @Test
    public void meth5(){
        AT05InheritanceBase obj1 = new AT05InheritanceBase();
        obj1.meth2(); // Meth2 is not overridden as we are accessing the method from parent class in a normal class.
    }
}

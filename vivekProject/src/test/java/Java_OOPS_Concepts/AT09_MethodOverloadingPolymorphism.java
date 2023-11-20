package Java_OOPS_Concepts;

import org.junit.Test;

public class AT09_MethodOverloadingPolymorphism {
    @Test

    public void polymorphism(){
        AT08_MethodOverloading obj = new AT08_MethodOverloading();
        obj.add();
        obj.add(50,60);

    }
}

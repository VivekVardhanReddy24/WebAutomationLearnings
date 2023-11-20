package Java_OOPS_Concepts;

import org.junit.Test;

public class AT04_Encapsulation2 {
@Test
    public void encMeth3(){
    AT03_Encapsulation1 obj = new AT03_Encapsulation1();
    obj.encMeth1(10,25);
    obj.encMeth1(50,45);

    int x= obj.encMeth2(25,50);
    int z =x+90;
    System.out.println("Result is "+ z);

}
}

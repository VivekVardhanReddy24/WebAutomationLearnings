package JavaLearning;

import org.junit.Test;

public class GlobalVariable {
    int i=10;
    int j =20;
    String MyName="Vivek";

    @Test
    public void test05() {
        //local variables
        int m =20;
        int x = m+j;
        System.out.println("x value is : "+x); //40
    }

    @Test
    public void test06(){
        int k = i+j;
        System.out.println("k value is : "+k); //30
        System.out.println("MyName is : "+MyName); //Vivek
    }

}

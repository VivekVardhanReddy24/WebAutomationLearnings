package Java_OOPS_Concepts;

import org.junit.Test;

public class AT08_MethodOverloading {
    @Test

    public void add(){
        int i=10;
        int j= 20;
        int k= i+j;
        System.out.println("Sum is "+k);
    }
    @Test
    public void add(int a, int b){
        int c = a+b;
        System.out.println("The sum is" +c);
    }
}

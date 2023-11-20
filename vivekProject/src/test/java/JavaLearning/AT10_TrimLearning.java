package JavaLearning;

import org.junit.Test;

public class AT10_TrimLearning {
    @Test
    public void test15(){
        String name ="   Vivek";
        System.out.println("The string before trimming is"+ name);
        System.out.println(("The string after trimming is " +name.trim()));
    }
}

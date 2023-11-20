package JavaLearning;

import org.junit.Test;

public class AT04_Objects {
    @Test
    public void test07(){
        // using classname we create an object Ex: obj
        // using this  object (obj) we call methods test08,test09 inside test07
        AT04_Objects obj = new AT04_Objects();
        System.out.println("I am method test07");
        obj.test08();
        obj.test09();

    }


    public void test08(){
        //declare local variables
        int i =10;
        int j =20;
        int k =i+j;
        //print on console
        System.out.println("value of k is : "+k); //30
    }
    public void test09(){
        //declare local variables
        String test01 = "Software";
        String test02 = " TestLab";
        String test03 = test01 + test02;
        System.out.println("value of Test03 is : " + test03); //SoftwareTestLab
    }

    

}

package Java_OOPS_Concepts;

import org.junit.Test;

public class AT13InterfaceImple implements AT12_InterfaceEx {


   public void add(){
        int z = 50+10;
        System.out.println(z);

    }

    public void sub(){
        int c = 20;
        int d =60;
        System.out.println("difference is "+ (c-d));
    }

    public void div() {
        int x = 100;
        int y = 10;
        //AT13InterfaceImple obj = new AT13InterfaceImple();

        System.out.println("The Result is  " + (x / y));
    }

        @Test
                public void result(){
            AT13InterfaceImple obj = new AT13InterfaceImple();
            obj.add();
            obj.sub();
            obj.div();
        }





}

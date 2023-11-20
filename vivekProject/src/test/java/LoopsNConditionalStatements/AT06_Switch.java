package LoopsNConditionalStatements;

import org.junit.Test;

public class AT06_Switch {
    @Test
    public void test(){
        switch (2){
            case 1:
                System.out.println("Case 1 is executed");
                break;

            case 2:
                System.out.println("Case 2 is executed");
                break;

            case 3:
                System.out.println("case 3 is executed");
                break;

            default:
                System.out.println("Invalid input entered");

        }
    }
}

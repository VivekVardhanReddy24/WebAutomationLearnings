package LoopsNConditionalStatements;

import org.junit.Test;

public class AT05_ElseIf {
    @Test
    public void test(){
        String browser ="hrome";
    if(browser.equalsIgnoreCase("chrome")){
        System.out.println("Test case executes on Chrome");
    }
    else if(browser.equalsIgnoreCase("firefox")){
        System.out.println("Test Case executes on firefox");
    }else if(browser.equalsIgnoreCase("IE")){
        System.out.println("Test case executes on IE");
    }else{
        System.out.println("Test case will not be executed");
    }
    }
}

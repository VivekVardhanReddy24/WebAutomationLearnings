package JavaLearning;

import org.junit.Test;

import java.util.ArrayList;

public class AT08_ArrayList {
    @Test
    public void ArrayList() {
        //syntax of arraylist
        ArrayList<String> ListofCars = new ArrayList<String>();
        ListofCars.add("BMW");
        ListofCars.add("Toyota");
        ListofCars.add("Benz");
        ListofCars.add("RangeRover");
        System.out.println("cars inside Array list are : "+ ListofCars);
        //count
        int CarsCount =ListofCars.size();
        System.out.println("CarsCount : "+CarsCount); //4
        for(int i=0;i<CarsCount;i++){
            System.out.println("Array index is : "+i+" and its value is : "+ListofCars.get(i));
        }
    }
}

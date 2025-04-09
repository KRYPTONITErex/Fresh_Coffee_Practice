package JavaHowTO;

import java.util.HashMap;

public class htLoopWifHaspMap {

    public static void main(String[]args){

        HashMap<String,Integer> Cars = new HashMap<>();
        Cars.put("BMW", 2010);
        Cars.put("Volvo", 2015);
        Cars.put("Ford", 2018);
        Cars.put("Mazda", 2020);
        Cars.put("Tesla", 2022);
        Cars.put("Toyota", 2023);
        Cars.put("Honda", 2024);

        System.out.println(Cars);
        System.out.println(Cars.keySet());
        System.out.println(Cars.values());

        for(String car : Cars.keySet()){
            System.out.println("Key : "+ car + ", values : "+ Cars.get(car));
        }

    }
}

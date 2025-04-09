package FreshCoffee_Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaComparable {

    public static void main(String[]args){

        List<yourCars> urCar = new ArrayList<yourCars>();
        urCar.add(new yourCars("Toyota", 2020 , "Camerae"));
        urCar.add(new yourCars("Honda", 2019, "Civic"));
        urCar.add(new yourCars("Ford", 2021, "Mustang"));
        urCar.add(new yourCars("Tesla", 2022, "Model S"));
        urCar.add(new yourCars("Nissan", 2018, "Altima"));

        Collections.sort(urCar);
        System.out.println(urCar);

        System.out.println("\n---After Sorting---");

        for(yourCars car : urCar){
            System.out.println(car);
        }

    }
}
class yourCars implements Comparable{
    String carBrandName;
    int year;
    String modelName;

    public yourCars(String cBN, int yr, String mN){
        carBrandName = cBN; year = yr; modelName = mN;
    }

    @Override
    public int compareTo(Object o) {
        yourCars otherCar = (yourCars) o;
        if(year>otherCar.year){return 1;}
        else if(year<otherCar.year){return -1;}
        return 0;
    }

    public String toString(){
        return "Your Car Info: " + carBrandName + " : " + year + " : " + modelName;
    }
}
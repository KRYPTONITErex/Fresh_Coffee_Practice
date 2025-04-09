package FreshCoffee_Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorCustomType {

    public static void main(String[]args){

        ArrayList<Cars> myCars = new ArrayList<Cars>();
        myCars.add(new Cars("BMW","x5", 2010));
        myCars.add(new Cars("Audi", "A4", 2015));
        myCars.add(new Cars("Mercedes", "C-class", 2018));
        myCars.add(new Cars("Toyota", "Camry", 2012));
        myCars.add(new Cars("Honda", "Accord", 2016));
        myCars.add(new Cars("Ford", "Mustang", 2019));
        myCars.add(new Cars("Chevrolet", "Camaro", 2014));
        myCars.add(new Cars("Nissan", "Altima", 2017));

        System.out.println(myCars);
//        Collections.sort(myCars);

//        Comparator myComparator = new sortByYear();
//        Collections.sort(myCars, myComparator);
        Collections.sort(myCars, new sortByYear());
        System.out.println(myCars);

        for(Cars car:myCars){
            System.out.println(car);
        }
    }
}

class Cars{
    private String name;
    private String model;
    private int year;

    public Cars(String name, String model, int year){
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public String getName(){return name;}
    public String getModel(){return model;}
    public int getYear(){return year;}

    public String toString(){
        return "Car: "+name+" "+model+" "+year;
    }

}

class sortByYear implements Comparator<Cars> {
    @Override
    public int compare(Cars o1, Cars o2) {
        if(o1.getYear()<o2.getYear()){
            return 1;
        }else if(o1.getYear()>o2.getYear()){
            return -1;
        }
        return 0;
    }


}

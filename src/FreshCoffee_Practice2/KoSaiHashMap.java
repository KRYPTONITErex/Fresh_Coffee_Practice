package FreshCoffee_Practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class KoSaiHashMap {

    public static void main(String[]args){

        Map<MyComputer,Integer> myComMap = new HashMap<MyComputer,Integer>();
        myComMap.put(new MyComputer("Dell",8,"Latitude"),1000);
        myComMap.put(new MyComputer("Dell",8,"Latitude"), 2000);

        myComMap.put(new MyComputer("Dell",8,"Latitude"), 3000);
        myComMap.put(new MyComputer("Dell",16,"Vostro"), 4000);

        myComMap.put(new MyComputer("Apple",8,"M2"), 5000);
        myComMap.put(new MyComputer("Apple",8,"M3"), 6000);

        System.out.println(Objects.hashCode(new MyComputer("Dell",8,"Latitude")));
        System.out.println(Objects.hashCode(new MyComputer("Dell",8,"Latitude")));
        System.out.println(Objects.hashCode(new MyComputer("Apple",8,"M2")));
        System.out.println(Objects.hashCode(new MyComputer("Apple",8,"M3")));

        System.out.println(myComMap.size());
        System.out.println(myComMap.get(new MyComputer("Dell", 8, "Latitude")));

        for(MyComputer key : myComMap.keySet()){
            System.out.println(key);
        }

    }
}

class MyComputer {
    String brand;
        int ram;
    String modelName;

    public MyComputer(String brand,int ram, String modelName) {
        this.brand = brand;
        this.ram = ram;
        this.modelName = modelName;
    }

    //not override default codes
//    public int hashCode();
//    public boolean equals(Object obj) {
//        return (this == obj);
//    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(modelName,ram, brand);
//    }
//    public boolean equals(Object o) {
//        MyComputer other = (MyComputer) o;
//        return this.brand.equals(other.brand) && this.ram == other.ram &&
//               this.modelName.equals(other.modelName);
//    }

//
    public int hashCode() {
        return brand.hashCode() + ram + modelName.hashCode();
    }
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        MyComputer other = (MyComputer) o;
        return this.brand.equals(other.brand) &&
                this.ram == other.ram &&
                this.modelName.equals(other.modelName);
    }



    @Override
    public String toString() {
        return STR."MyComputer{brand='\{brand}', ram=\{ram}, modelName='\{modelName}'}";
    }
}
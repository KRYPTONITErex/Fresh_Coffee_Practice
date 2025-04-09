package FreshCoffee_Practice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

    public static void main(String[]args){
//
//        Map<Integer,String> fruits = new HashMap<>();
//        fruits.put(33,"Apples");
//        fruits.put(23, "Oranges");
//        fruits.put(73, "Bananas");
//        fruits.put(44, "Pineapples");
//        fruits.put(95, "Mangoes");
//
//        System.out.println(fruits);
//
//        for(Integer key : fruits.keySet()){
//            System.out.println(key+" : "+fruits.get(key));
//        }

        Map<Integer,String> fruits = new HashMap<>();
        Map<Integer,String> fruits2 = new LinkedHashMap<>();
        Map<Integer,String> fruits3 = new TreeMap<>();

//        testMap(fruits);
//        testMap(fruits2);
        testMap(fruits3);

    }

public static void testMap(Map<Integer,String> fruits){

    fruits.put(433, "Apples");
    fruits.put(523, "Oranges");
    fruits.put(273, "Bananas");
    fruits.put(644, "Pineapples");
    fruits.put(595, "Mangoes");

    for(Integer key : fruits.keySet()){
        System.out.println(key+" : "+fruits.get(key));
    }
}

}


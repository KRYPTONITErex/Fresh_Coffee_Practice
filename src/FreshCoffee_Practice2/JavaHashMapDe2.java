package FreshCoffee_Practice2;

import java.util.HashMap;

public class JavaHashMapDe2 {

    public static void main(String[]args){

        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        people.put("Lwin", 23);
        people.put("Phyo", 25);

        System.out.println(people);
        System.out.println(people.get("John"));
        System.out.println(people.size());
        System.out.println(people.keySet());
        System.out.println(people.values());
        System.out.println(people.containsKey("John"));
        System.out.println(people.containsValue(32));
        System.out.println(people.remove("John"));
        System.out.println(people);
        System.out.println(people.replace("Lwin", 23, 24));
        System.out.println(people);
        System.out.println(people.keySet());
        System.out.println(people.values());
        System.out.println(people.entrySet());

        for(String i : people.keySet()){
            System.out.println("key: "+i+", values: "+people.get(i));
        }
    }
}


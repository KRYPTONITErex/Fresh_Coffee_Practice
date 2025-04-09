package JavaExamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[]args){

        HashSet<String> cityNames = new HashSet<>();
        cityNames.add("Yangon");
        cityNames.add("Mandalay");
        cityNames.add("Naypyidaw");
        cityNames.add("Bago");
        cityNames.add("Mandalay");
        cityNames.add("Mandalay");
        cityNames.add("Sagaing");
        cityNames.add("Magway");
        cityNames.add("Yangon");

        System.out.println(cityNames);
        System.out.println(cityNames.size());
        cityNames.remove("Yangon");
        System.out.println(cityNames);
        System.out.println(cityNames.size());

//        Collections.sort(cityNames);
//        cannot sort HashSet --> Convert to ArrayList first

        ArrayList<String> sortedList = new ArrayList<>(cityNames);
        Collections.sort(sortedList);
        System.out.println(sortedList);

        System.out.println(cityNames.contains("Yangon"));
        System.out.println(cityNames.contains("Bago"));

        for(String i : cityNames){
            if(cityNames.contains(i)){
                System.out.println("Yes, it contains " + i);
            }else {
                System.out.println("No, it does not contain");
            }
        }
    }
}

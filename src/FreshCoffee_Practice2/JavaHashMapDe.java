package FreshCoffee_Practice2;
import java.util.HashMap;

public class JavaHashMapDe {

    public static void main(String[]args){

        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Thailand", "Bangkok");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));

        capitalCities.remove("Thailand");
        System.out.println(capitalCities);

        capitalCities.put("Thailand", "cityInfo");
        int size = capitalCities.size();
        System.out.println(size);

//        for(String i = 0; i< capitalCities.size(); i++){
//            System.out.println(i + " " + capitalCities.get(i));
//        }

        for(String i : capitalCities.keySet()){
            System.out.print(i+ "/ ");
        }
        System.out.println("");

        for(String i : capitalCities.values()){
            System.out.print(i+ "/ ");
        }
        System.out.println(" ");

        for(String i : capitalCities.keySet()){
            System.out.print("\nkey-> "+i+", values: "+capitalCities.get(i));
        }

        capitalCities.clear();
        System.out.println();
        System.out.println(capitalCities);
    }
}

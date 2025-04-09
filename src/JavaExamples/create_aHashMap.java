package JavaExamples;

import java.util.HashMap;

public class create_aHashMap {

    public static void main(String[]args){

        HashMap<String,Integer> stitStudents = new HashMap<>();
        stitStudents.put("Lwin",23);
        stitStudents.put("Kaung", 28);
        stitStudents.put("Aung", 25);
        stitStudents.put("Yati", 20);
        stitStudents.put("KoSai", 30);

        System.out.println(stitStudents);
        System.out.println(stitStudents.keySet());
        System.out.println(stitStudents.values());

        System.out.println(stitStudents.get("Kaung"));
        stitStudents.remove("Kaung");

        for( String i : stitStudents.keySet()){
            System.out.println("Key : "+ i + ", values : "+ stitStudents.get(i));
        }

        System.out.println(stitStudents.size());
        stitStudents.clear();
        System.out.println(stitStudents);


    }
}

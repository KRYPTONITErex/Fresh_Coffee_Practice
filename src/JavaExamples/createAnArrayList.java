package JavaExamples;

import java.util.ArrayList;
import java.util.Collections;

public class createAnArrayList {

    public static void main(String[]args){

        ArrayList<String> stuNames = new ArrayList<String>();
        stuNames.add("Lwin");
        stuNames.add("Kaung");
        stuNames.add("Aung");
        stuNames.add("Yati");
        stuNames.add("KoSai");

        System.out.println(stuNames);
        System.out.println(stuNames.get(2));
        stuNames.set(2,"Aung Kaung");
        System.out.println(stuNames);
        Collections.sort(stuNames);
        System.out.println(stuNames);
        //reversed order
        Collections.sort(stuNames,Collections.reverseOrder());
        System.out.println(stuNames);
        stuNames.remove(2);
        System.out.println(stuNames);

        for(String names : stuNames){
            System.out.print(names + " / ");
        }

        ArrayList<Integer> stuAges = new ArrayList<Integer>();
        stuAges.add(23);
        stuAges.add(28);
        stuAges.add(22);
        stuAges.add(29);
        stuAges.add(30);
        System.out.println(stuAges);
        Collections.sort(stuAges);
        System.out.println(stuAges);

        Collections.sort(stuAges, Collections.reverseOrder());
        System.out.println(stuAges);
        System.out.println(stuAges.get(4));
        for(int i = 0; i<stuAges.size(); i++){
            System.out.print(stuAges.get(i)+ " /  ");
        }
        System.out.println(stuAges.size());
        //remove all items
        stuAges.clear();
        System.out.println(stuAges);

    }
}

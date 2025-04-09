package FreshCoffee_Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInterfaceCode2 {

    public static void main(String[]args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(19);
        numbers.add(20);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        System.out.println("numbers are : " + numbers);
        numbers.add(3,21);
        System.out.println("numbers are : " + numbers);

//        Collections.sort(numbers);
//        System.out.println(numbers);

        Comparator<Integer> com = new MyComparator();
        Collections.sort(numbers,com);
        System.out.println(numbers);


        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Alice");
        names.add("Bob");
        names.add("Sue");
        System.out.println("names are : " + names);

        names.add(3, "Tom");
        System.out.println("names are : " + names);

        Comparator<String> com2 = new AlphabaticalComparator();
        Collections.sort(names, com2);
        System.out.println(names);

        for(String name : names){
            System.out.println(name);
        }

        Comparator<String> com3 = new LengthComparator();
        Collections.sort(names, com3);
        System.out.println(names);

    }
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer num1, Integer num2) {
        if(num1>num2){
            return 1;
        }else if (num1<num2){
            return -1;
        }
        return 0;
    }
}

class AlphabaticalComparator implements Comparator<String>{

    @Override
    public int compare(String obj1, String obj2) {
//        if(obj1.compareTo(obj2)>0){
//            return -1;
//        }else if(obj1.compareTo(obj2)<0){
//            return 1;
//        }
//        return 0;

        return -obj1.compareTo(obj2);
    }
}

class LengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()>o2.length()){
            return -1;
        }else if(o1.length()<o2.length()){
            return 1;
        }
        return 0;
    }
}

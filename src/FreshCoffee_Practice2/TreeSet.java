package FreshCoffee_Practice2;

import java.util.Set;

public class TreeSet {
    public static void main(String[]args){

        Set<String> stuNames = new java.util.TreeSet<>();
        stuNames.add("John");
        stuNames.add("Jane");
        stuNames.add("Alice");
        stuNames.add("Bob");
        stuNames.add("Eve");

        System.out.println(stuNames);

        Set<String> memberNames = new java.util.TreeSet<>();
        memberNames.add("John");
        memberNames.add("Jane");
        memberNames.add("Alex");
        memberNames.add("Bibe");
        memberNames.add("Everest");

        System.out.println(memberNames);

//        memberNames.retainAll(stuNames);
//        System.out.println(memberNames);

//        stuNames.retainAll(memberNames);
//        System.out.println(stuNames);

        memberNames.removeAll(stuNames);
        System.out.println(memberNames);

        stuNames.removeAll(memberNames);
        System.out.println(stuNames);

    }
}

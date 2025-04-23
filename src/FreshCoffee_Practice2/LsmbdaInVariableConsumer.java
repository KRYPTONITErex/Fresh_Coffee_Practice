package FreshCoffee_Practice2;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LsmbdaInVariableConsumer {

    public static void main(String[]args){

        ArrayList<Integer> numbaa = new ArrayList<Integer>();
        numbaa.add(5);
        numbaa.add(3);
        numbaa.add(4);
        numbaa.add(1);
        numbaa.add(2);
        numbaa.add(8);

        //store lambda in variable
        Consumer<Integer> printNumbaa = n -> System.out.println(n);

        //use variable in forEach
        numbaa.forEach(printNumbaa);

        ArrayList<String> name = new ArrayList<String>();
        name.add("Alex");
        name.add("Bob");
        name.add("Charlie");
        name.add("David");
        name.add("Eve");

        Consumer<String> printName = n -> System.out.println(n);
        name.forEach(printName);
    }
}

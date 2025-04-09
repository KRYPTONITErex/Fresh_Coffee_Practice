package FreshCoffee_Practice2;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIteratorDe2 {

    public static void main(String[]args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(22);
        numbers.add(9);
        System.out.println(numbers);

        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i < 10){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}

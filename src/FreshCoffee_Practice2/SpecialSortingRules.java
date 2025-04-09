package FreshCoffee_Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpecialSortingRules {

    public static void main(String[]args){

        List<Integer> myNumberss = new ArrayList<>();
        myNumberss.add(33);
        myNumberss.add(15);
        myNumberss.add(20);
        myNumberss.add(34);
        myNumberss.add(8);
        myNumberss.add(12);

        Collections.sort(myNumberss);
        System.out.println(myNumberss);

        Collections.sort(myNumberss,new evenFirstOrder());
        System.out.println(myNumberss);
    }
}

class evenFirstOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        boolean o1IsEven = o1 % 2 == 0;
        boolean o2IsEven = o2 % 2 == 0;

        if(o1IsEven == o2IsEven){
            if(o1<o2){return -1;}
            if(o1>o2){return 1;}
        }else {
            if(o1IsEven){return -1;}
            else {return 1;}
        }

        return 0;
    }
}
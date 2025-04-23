package FreshCoffee_Practice2;

import java.util.ArrayList;

public class LambdaInsideForEach {

    public static void main(String[]args){

        ArrayList<Integer> numba = new ArrayList<Integer>();
        numba.add(5);
        numba.add(3);
        numba.add(4);
        numba.add(1);
        numba.add(2);
        numba.add(8);

        numba.forEach(n-> System.out.println(n));

//        for (int i : numba){
//            System.out.println(i);
//        }

    }
}

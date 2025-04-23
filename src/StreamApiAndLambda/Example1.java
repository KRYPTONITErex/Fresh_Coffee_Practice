package StreamApiAndLambda;

import java.util.Comparator;

public class Example1 {

    public static void main(String[]args){



    }

    //Traditional way
    Comparator<Integer> comp1 = new Comparator<Integer>(){
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };

    //Lambda version
    Comparator<Integer> comp2 = (Integer o1, Integer o2)->o1.compareTo(o2);
}

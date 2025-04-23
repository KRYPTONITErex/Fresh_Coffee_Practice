package JavaCollections_MiniCodeTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C1RmDuplicateFrmList {

    public static void main(String[]args){

        List<Integer> numbers = Arrays.asList(5,1,2,2,3,4,4,5);

        System.out.println(numbers);
        System.out.println(numbers.size());


        System.out.println("With LinkedHashSet");

        Set<Integer> HNumbers = new HashSet<>(numbers);
//        HNumbers.addAll(numbers);
        System.out.println(HNumbers);
        System.out.println(HNumbers.size());


    }
}

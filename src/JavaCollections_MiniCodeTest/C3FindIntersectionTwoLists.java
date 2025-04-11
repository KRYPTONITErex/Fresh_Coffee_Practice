package JavaCollections_MiniCodeTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C3FindIntersectionTwoLists {

    public static void main(String[]args){

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        Set<Integer> listSet1 = new HashSet<>(list1);
        Set<Integer> listSet2 = new HashSet<>(list2);

        listSet2.retainAll(listSet1);
        System.out.println(listSet2);
    }
}

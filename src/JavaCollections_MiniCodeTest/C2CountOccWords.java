package JavaCollections_MiniCodeTest;

import java.util.*;

public class C2CountOccWords {

    public static void main(String[]args){

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana","banana");

        Map<String,Integer> wordCount = new HashMap<>();
        for (String word : words) {
//            System.out.println(word);

            int count = 0;
            if (wordCount.containsKey(word)) {

//                System.out.println(wordCount.get(word));

                count = wordCount.get(word);
                System.out.println(word +" - "+ count);
            }

            wordCount.put( word, (count + 1) );

        }
        System.out.println(wordCount);

    }

}

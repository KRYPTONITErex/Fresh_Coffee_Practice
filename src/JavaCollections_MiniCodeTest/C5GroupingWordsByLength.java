package JavaCollections_MiniCodeTest;

import java.util.*;

public class C5GroupingWordsByLength {

    public static void main(String[]args){

        List<String> words = Arrays.asList("cat", "dog", "elephant", "elephant", "bat", "fish", "ant","cat");


        Map<Integer, Set<String>> wordsByLength = new HashMap<>();

        for (String word : words) {
            int length = word.length();

            Set<String> wordSet = new HashSet<>();
            wordSet.add(word);
//            System.out.println(wordSet);

            wordsByLength.put(length, wordSet);
        }
        System.out.println(wordsByLength);

    }
}

package StreamApiAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GPTSteamFilter {

    public static void main(String[]args){

        List<String> users = Arrays.asList("Alice", "Bob","Alex", "Charlie","Dexon", "David", "Eve");

        List<String> usersStartA = new ArrayList<>();
        for(String user : users){
            if(user.startsWith("A")){
//                System.out.println(user);
                usersStartA.add(user);
            }
        }
        System.out.println(usersStartA);

        System.out.println("---------");

        List<String> usersStartD = users.stream()
                .filter(user -> user.startsWith("D"))
                .toList();

        System.out.println(usersStartD);
    }
}

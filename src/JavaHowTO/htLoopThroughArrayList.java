package JavaHowTO;

import java.util.ArrayList;

public class htLoopThroughArrayList {

    public static void main(String[]args){

        ArrayList<String> Names = new ArrayList<>();
        Names.add("John");
        Names.add("Bob");
        Names.add("Mark");
        Names.add("Steve");
        Names.add("James");
        Names.add("Paul");
        Names.add("Jill");
        Names.add("Jenny");

        System.out.println("Names are ... ");
        for(String name : Names){
            System.out.print( name + " | ");
        }
    }
}

package ExceptionHandlingAndExercisesCombo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EHthrowDeclaration {

    public static void main(String[]args){

        File file = new File("/Users/lwinphyo/Desktop/exceptionTest/Hi here.txt");

        try{
            readFile(file);
            System.out.println("File Exists...");
        }catch (Exception e){
            System.out.println("File not found...");
            e.printStackTrace();
        }
        System.out.println("Continue loading ...");
    }

    public static void readFile(File file) throws FileNotFoundException {

        Scanner scan = new Scanner(file);
        System.out.println("File Exists in there ... ");
        System.out.println("Continue doing ...");

    }

    public static class NullPointerExcepCheck {

        public static void main(String[]args){

    //        String myName = "";
    //        String myName = "";
    //        try {
    //            if(myName.equals("Lwin")){
    //                System.out.println("My Name is Lwin");
    //            }
    //            else{
    //                System.out.println("My Name is not Lwin");
    //            }
    //        }catch (NullPointerException e){
    //            System.out.println("Null Pointer Exception");
    //        }

            List<Integer> numbra = new ArrayList<>();
            numbra.add(5);
            numbra.add(9);
            numbra.add(8);
            numbra.add(1);

            //write lambda to double and print each number
    //        numbra.forEach(n-> System.out.println(n*2));

            //write lambda to print even number
    //        numbra.forEach(n->{
    //            if(n%2==0){
    //                System.out.println(n);
    //            }
    //        });

            //Define Consumer variable print square of numbra
    //        Consumer<Integer> sqPrinter = n-> System.out.println(n*n);
    //        numbra.forEach(sqPrinter);



            StringFunction reverse = s->new StringBuilder(s).reverse().toString();
            printFormatted("Lwin", reverse);


        }

        interface StringFunction{
            String run(String str);
        }

        public static void printFormatted(String str, StringFunction format){
            String result = format.run(str);
            System.out.println(result);
        }
    }
}



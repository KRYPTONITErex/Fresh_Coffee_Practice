package FreshCoffee_Practice2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionEx2 {

    public static void main(String[]args){

        File filetest = new File("/Users/lwinphyo/Desktop/Access to Application Tool for Lwin Phyo.pdf");

        try {
            Scanner scan = new Scanner(filetest);
            System.out.println(scan);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            System.out.println("File exists in there !! ..");
        }catch (Exception e){
            System.out.println("File not found");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Move forward anyWay.");
        }
    }
}



//CHATGPT ANS :
//    public static void main(String[] args) {
//        try {
//            File file = new File("/Users/lwinphyo/Desktop/Access to Application Tool for Lwin Phyo.pd");
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("❌ File not found!");
//        } finally {
//            System.out.println("✅ File check done.");
//        }
//    }
//}

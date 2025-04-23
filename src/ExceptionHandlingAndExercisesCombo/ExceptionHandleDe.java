//package FreshCoffee_Practice2;
//
//import java.io.File;
//import java.util.Scanner;
//
//public class ExceptionHandleDe{
//
//    public static void main(String[]args) {
//
//        File file = new File("/Users/lwinphyo/Desktop/exceptionTest/Hi there.txt");
//
//        try {
//            Scanner scan = new Scanner(file).useDelimiter("\r|\n|\r\n");
////            Scanner scan = new Scanner(file);
//            System.out.println("File Exists...");
////            String line = scan.nextLine();
////            System.out.print(line);
//
//            while (scan.hasNext()) {
//                String line = scan.next();
//                System.out.println("Line: " + line);
//            }
//
//            scan.close();
//
//        }catch (Exception e){
//            System.out.println("File not found...");
//            e.printStackTrace();
//        }
//
//    }
//}


package ExceptionHandlingAndExercisesCombo;

import java.io.*;

public class ExceptionHandleDe {

    public static void main(String[] args) {
        File file = new File("/Users/lwinphyo/Desktop/exceptionTest/Hi there.txt");

        try {
            System.out.println("File Exists...");

            // Use BufferedReader instead of Scanner
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                System.out.println("Line " + lineCount + ": " + line);
            }

            if (lineCount == 0) {
                System.out.println("File exists but appears to be empty or has format issues");
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading file...");
            e.printStackTrace();
        } finally {
            System.out.println("Operation completed");
        }
    }
}
package FreshCoffee_Practice2;

import java.io.File;
import java.io.FileNotFoundException;
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
}



package ExceptionHandlingAndExercisesCombo;

import java.io.File;
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

    public static class ExceptionEx3 {

        public static void main(String[]args){

            Scanner scan = new Scanner(System.in);

            System.out.println("Sign Up your Account !! ");
            System.out.println("Enter your name");
            String name = scan.nextLine();

            boolean validPw = false;

            try {
                while (!validPw){
                    System.out.println("Enter your Password");
                    String password = scan.nextLine();

                    if(password.length() < 8){
                        System.out.println("Password is too short");
                    } else if (!password.contains("!") && !password.contains("@") &&
                            !password.contains("#") && !password.contains("$")) {
                        System.out.println("Password must contain a special character");
                    } else {
                        System.out.println("Account created successfully");
                        System.out.println("Welcome as a new member of us ! " + name);
                        break;
                    }

                }
            }catch (Exception e){
                System.out.println("Error is "+e.getMessage());

            } finally {
                System.out.println("Thanks for visiting our page!");
                scan.close();
            }
        }
    }

    public static class ExceptionEx1 {

        public static void main(String[]args){

            Scanner scan = new Scanner(System.in);

            System.out.println("Check for the reminder !");

            System.out.println("Enter ur first number");
            int num1 = scan.nextInt();
            System.out.println("Enter ur second number");
            int num2 = scan.nextInt();

            try{
                int result = num1%num2;
                System.out.println("Result reminder is "+result);
            }catch (ArithmeticException e){
                System.out.println("Error is "+e.getMessage());
            }

            scan.close();
        }
    }
}





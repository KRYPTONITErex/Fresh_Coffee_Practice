package FreshCoffee_Practice2;

import java.util.Scanner;

public class ExceptionEx1 {

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

//CHATGPT ANS :
//import java.util.Scanner;
//
//public class ExceptionEx1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.print("Enter number 1: ");
//            int a = scanner.nextInt();
//            System.out.print("Enter number 2: ");
//            int b = scanner.nextInt();
//
//            int result = a % b;
//            System.out.println("Result is: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("❌ Error: Cannot divide by zero.");
//        } finally {
//            System.out.println("✅ Division task finished.");
//        }
//    }
//}

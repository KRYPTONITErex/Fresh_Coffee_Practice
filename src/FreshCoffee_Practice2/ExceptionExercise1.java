package FreshCoffee_Practice2;

import EmployeeManagement.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercise1 {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);


        try{
            System.out.println("Enter a number to divide 100 by it");
            int num = scan.nextInt();

            int result = 100/num;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("You can't divide by zero");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Enter a Valid number");
            e.printStackTrace();
        }finally {
            scan.close();
            System.out.println("Finally come out !!");
        }
    }
}

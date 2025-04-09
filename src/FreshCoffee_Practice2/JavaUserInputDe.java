package FreshCoffee_Practice2;
import java.util.Scanner;

public class JavaUserInputDe {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ur Name : ");
        String Name = scan.nextLine();
        System.out.println("Enter ur Age : ");
        int Age = scan.nextInt();
        System.out.println("Enter ur Salary : ");
        double Salary = scan.nextDouble();

        System.out.printf("Hello %s , you are %d years old and only getting %.2f salary",Name,Age,Salary);
    }
}


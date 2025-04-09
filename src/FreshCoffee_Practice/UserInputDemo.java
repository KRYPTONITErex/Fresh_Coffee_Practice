package FreshCoffee_Practice;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name");

        String userName = scan.nextLine();
        System.out.println("Hi " + userName + " , Welcome to our system");

        System.out.println("Enter you age and salary");
        int age = scan.nextInt();
        double salary = scan.nextDouble();

        System.out.println(" And you are " + age + " age with " + salary + "salary");

        scan.close();

    }
}

//scan.nextBoolean();
//scan.nextByte();
//scan.nextInt();
//scan.nextLine();
//scan.nextFloat();
//scan.nextLong();
//scan.nextShort();
//scan.nextDouble();
//scan.next();




package JavaHowTO;


import java.util.Scanner;

public class htAddTwoNumbers {

    public static void main(String[]args){

        int x = 5; int y = 10;
        int sum = x + y;
        System.out.println(sum);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        Double firstNumb = scan.nextDouble();

        System.out.println("Enter second number: ");
        Double secondNumb = scan.nextDouble();

        Double sum2 = firstNumb + secondNumb;
        System.out.println("Two sum of your number is : " + sum2);
    }
}

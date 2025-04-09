package FreshCoffee_Practice3GPT;
import java.util.Scanner;

public class ControlStructure3 {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for multiplication : ");

        int num = scan.nextInt();

        for(int i=1; i<=10; i++){
            System.out.print(num + " x " + i + " = " + (num*i)+ " | ");
        }
    }
}

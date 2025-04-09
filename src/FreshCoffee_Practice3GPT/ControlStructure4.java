package FreshCoffee_Practice3GPT;

import java.util.Scanner;

public class ControlStructure4 {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number (n) : ");
        int n = scan.nextInt();

        int i = 0;
        while(i <= n){
            System.out.print(i + " ");
            i+=2;
        }
        scan.close();
    }
}

package JavaHowTO;

import java.util.Scanner;

public class htCheckEvenOrOdd {
    public static void main(String[]args){

//        int number =  5;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check ... ");
        int number = scan.nextInt();

        if(number%2==0){
            System.out.println(number + " is even number " );
        }else {
            System.out.println(number + " is odd number " );
        }

        scan.close();
    }
}

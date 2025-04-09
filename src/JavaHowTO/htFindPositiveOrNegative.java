package JavaHowTO;

import java.util.Scanner;

public class htFindPositiveOrNegative {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number to check Positive or Negative");
            int myNum = scan.nextInt();

            if(myNum>0){
                System.out.println(myNum + " is positive number.");
            }else if(myNum<0){
                System.out.println(myNum + " is negative number.");
            }else{
                System.out.println(myNum + " is zero.");
                break;
            }
        }
    }
}

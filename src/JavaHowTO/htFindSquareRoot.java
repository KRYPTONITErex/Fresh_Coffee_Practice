package JavaHowTO;

import java.util.Scanner;

public class htFindSquareRoot {

    public static void main(String[]args){

        double num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to find the sqRoot number");
        num = scan.nextInt();

        System.out.println(Math.sqrt(num));

        scan.close();

        System.out.println((int)(Math.random()*100));
    }
}

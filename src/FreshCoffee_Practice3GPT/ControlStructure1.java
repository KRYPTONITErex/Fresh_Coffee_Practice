package FreshCoffee_Practice3GPT;
import java.util.Scanner;

public class ControlStructure1 {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number ... : ");
            int num = scan.nextInt();

            if(num == 0) {
                System.out.println("it is zero");
            }else if(num %2 == 0){
                System.out.println("it is positive");
            }else {
                System.out.println("it is odd numb");
                break;
            }
        }
scan.close();
    }
}

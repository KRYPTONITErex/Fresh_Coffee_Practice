package FreshCoffee_Practice3GPT;
import java.util.Scanner;

public class ControlStructure5 {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        String correctPw = "java123!";
        String  userInputPw = "";

        do{
            System.out.println("Enter a Password : ");
            userInputPw = scan.next();
        }while (!userInputPw.equals(correctPw));

        System.out.println("Access Granted!");
        scan.close();

    }
}

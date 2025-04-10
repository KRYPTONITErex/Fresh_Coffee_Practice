package FreshCoffee_Practice2;
import java.util.Scanner;

public class ExceptionEx3 {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Sign Up your Account !! ");
        System.out.println("Enter your name");
        String name = scan.nextLine();

        boolean validPw = false;

        try {
            while (!validPw){
                System.out.println("Enter your Password");
                String password = scan.nextLine();

                if(password.length() < 8){
                    System.out.println("Password is too short");
                } else if (!password.contains("!") && !password.contains("@") &&
                        !password.contains("#") && !password.contains("$")) {
                    System.out.println("Password must contain a special character");
                } else {
                    System.out.println("Account created successfully");
                    System.out.println("Welcome as a new member of us ! " + name);
                    break;
                }

            }
        }catch (Exception e){
            System.out.println("Error is "+e.getMessage());

        } finally {
            System.out.println("Thanks for visiting our page!");
            scan.close();
        }
    }
}


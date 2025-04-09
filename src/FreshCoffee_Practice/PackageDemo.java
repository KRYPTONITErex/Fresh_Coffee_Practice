package FreshCoffee_Practice;
import java.util.Scanner;

public class PackageDemo {

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int age = -1;
        while (age<18 || age>60){
            String yourName = "";
            while (yourName.trim().isEmpty()){
                System.out.println("Enter your Name : ");
                yourName = scan.nextLine();
            }
            System.out.println("Enter your name");

            System.out.println("How old are you : ");
            while (!scan.hasNextInt()){
                System.out.println("Invalid! type valid one again!");
                scan.nextLine();
            }
            age = scan.nextInt();
            scan.nextLine();

            System.out.println("Hello " + yourName + " You are " + age + " Old");

            if(age<18){
                System.out.println("Too Young bro\n");
            } else if (age>60) {
                System.out.println("Ohh, too old man\n");
            }else {
                System.out.println("Congratulation, welcome to our team\n");
            }
        }
        scan.close();
    }
}

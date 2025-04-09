package FreshCoffee_Practice2;
import java.util.Scanner;
import mypack.MyPackageClass;

public class JavaPackageAPIDe {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ur Name \t: ");
        String name = scan.nextLine();
        System.out.println("Enter ur Age \t: ");
        int age = scan.nextInt();

        People person;    // Declare a People reference

        if(age<18){
            person = new unAdult(name,age);
        } else if (age>18) {
            person = new youngGuy(name, age);
        }else {
            System.out.println("Wait for management decison.");
            scan.close();
            return;
        }
        person.comeToParty();
        scan.close();

        MyPackageClass klp = new MyPackageClass();
        klp.display();
    }
}

abstract class People{
    protected String name;
    protected int age;
    People(String name, int age){
        this.name = name; this.age = age;
    }
    abstract void comeToParty();
}

class youngGuy extends People{
    youngGuy(String name, int age){
        super(name,age);
    }
    void comeToParty(){
        System.out.println("Hello, "+name+", your age is "+age+" confirm!");
        System.out.println("OK, you can come inside.");
    }
}
class unAdult extends People{
    unAdult(String name, int age){
        super(name, age);
    }
    void comeToParty(){
        System.out.println("Go back Home, " +name+ ". You are only "+age+" years old.");
    }
}



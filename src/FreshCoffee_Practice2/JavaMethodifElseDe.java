package FreshCoffee_Practice2;

public class JavaMethodifElseDe {

    static void checkAge(int age){
        if(age<18){
            System.out.println("You are too young to get in");
        }else if(age>60){
            System.out.println("Too Old to get in");
        }else {
            System.out.println("Welcome to our party!!");
        }
    }

    public static void main(String[]args){

        checkAge(15); checkAge(65);
        checkAge(25);
    }
}

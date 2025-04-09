package FreshCoffee_Practice2;

public class w3schoolThrowException {

    public static void main(String[]args){

        ageCheck ac = new ageCheck();

        ac.checkAge(21);
        System.out.println();
        ac.checkAge(10);

    }

}

class ageCheck{
    void checkAge(int age){

        if(age<20){
            throw new ArithmeticException("Access Denied - should be at least 20");
        }else {
            System.out.println("Access Granted");
        }
    }

}

class findExcep extends Exception{
    findExcep(String s){
        super(s);
    }
}
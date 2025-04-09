package FreshCoffee_Practice2;

public class customExceptionGPT {

    public static void main(String[]args){

        try {
            validateAge(15);

        }catch ( AgeException e){
            System.out.println(e.getMessage());
        }

    }

    static void validateAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("Age must be at least 18");
        }else {
            System.out.println("Age is valid");
        }
    }
}

class AgeException extends Exception{

    AgeException (String msg){
        super(msg);
    }
}

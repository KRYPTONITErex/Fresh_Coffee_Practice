package ExceptionAccessmentsQNA;

public class ExceptionHandlingQ5 {

    public static void main(String[]args){

        //What is Unchecked Exceptions? Write down some example code and description.
        /* ANS :

            Unchecked Exceptions --> not checked by Compiler.
                                 --> checked at runtime by JVM. (Runtime Exception)
                                 --> No need to declare in method with throws keyword.
            Exception => Runtime Exception => ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
            we can create custom unchecked exception by extending RuntimeException class and Exception class.

            It is happened because of logical errors or other runtime errors.
            It includes NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, etc.

        */

        //UncheckedException Example :
        try {
            int[] arr = new int[2];
            System.out.println(arr[3]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic error : "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error : "+e.getMessage());
        }

        try{
            int age = 15;
            if(age < 18){
                throw new AgeCheckException("Age must be 18 or above");
            }
        }catch (AgeCheckException e){
            System.out.println("Age check error : "+e.getMessage());
        }

        finally {
            System.out.println("It is finally");
        }

    }
}

class AgeCheckException extends RuntimeException{
    public AgeCheckException(String message){
        super(message);
    }
}



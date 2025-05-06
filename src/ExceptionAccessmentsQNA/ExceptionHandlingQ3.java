package ExceptionAccessmentsQNA;

public class ExceptionHandlingQ3 {

    public static void main(String[]args){

        //Can catch block  be polymorphic? If yes and Why? write down some example code with polymorphic in catch block
        /* ANS :

            Yes, catch block can be polymorphic.
            Polymorphic meaning "having many forms of use." -> can handle for different types of exceptions.
            We can handle catch exceptions from specific types of exceptions to general types of exceptions as per hierarchy.
            And we can obviously see with custom exceptions as well that extending the parent exceptions.

        */

       //Examples:
        try {
//            int result = 10 / 0;

            int [] arr = new int[2];
            System.out.println(arr[3]);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

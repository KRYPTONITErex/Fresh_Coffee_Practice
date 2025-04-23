package ExceptionHandlingAndExercisesCombo;

public class CustomExceptionLimitedExcceded {

    public static void main(String[]args){

        try{
            borrowedBook(2);
        }catch (LimitExceeded e){
            System.out.println("Error: "+e.getMessage());
        }

    }

    public static void borrowedBook(int borrowedBooks) throws LimitExceeded{
        if(borrowedBooks>3){
            throw new LimitExceeded("Each Member can only borrow upto 3 books only maximum.");
        }
        else{
            System.out.println("You can borrow more books.");
        }
        System.out.println("You Borrowed a book successfully.");
    }

}

class LimitExceeded extends Exception{
    public LimitExceeded(String message){
        super(message);
    }
}


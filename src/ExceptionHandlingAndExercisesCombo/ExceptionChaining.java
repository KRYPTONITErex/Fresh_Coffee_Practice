package ExceptionHandlingAndExercisesCombo;

public class ExceptionChaining {

    public static void main(String[]args){

        try {
            try{
                String s = null;
                s.length();
            } catch (NullPointerException e) {
                throw new DataException("Data is not available", e);
            }
        }catch (DataException e){
            System.out.println("Error: "+e.getMessage());
            System.out.println("Cause: "+e.getCause());
        }
        finally {
            System.out.println("It is Exception Chaining");
        }


    }
}

class DataException extends Exception{
    public DataException(String message, Throwable cause){
        super(message, cause);
    }
}

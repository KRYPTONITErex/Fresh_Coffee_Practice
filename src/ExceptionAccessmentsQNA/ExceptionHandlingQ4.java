package ExceptionAccessmentsQNA;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingQ4 {

    public static void main(String[]args) {

        //What is Checked Exceptions? Write down some example code and description.
        /* ANS :

            Checked Exceptions --> checked at compile-time by compiler. (Compile-time Exception)
            Exception => IOException/FileNotFoundException/SQLException/ClassNotFoundException, etc.
            we can create custom exception by extending Exception class.

            It is happened because of external factors failures of I/O operations, database operations, etc.
            It includes IOException, FileNotFoundException, SQLException, ClassNotFoundException, etc.

        */

        //CheckedException Example :
        try{
            MyFile f = new MyFile();
            f.checkMyFile();

        } catch (FileNotFoundException e){
            System.out.println("File location error : "+e.getMessage());
        }

        try {
            if(true){
                throw new MyCustomException("File NOT FOUND !");
            }
        } catch (MyCustomException e){
            System.out.println("Custom Exception : "+e.getMessage());
        }
    }
}

class MyFile{
    public void checkMyFile() throws FileNotFoundException {

        FileReader fr = new FileReader("/Users/lwinphyo/Desktop/Fresh Coffee/Fresh Coffee.im");
        System.out.println("Your File is exist in there !");

    }
}

class MyCustomException extends Exception{
    public MyCustomException(String message){
        super(message);
    }
}


package FreshCoffee_Practice2;

import java.io.File;
import java.io.FileNotFoundException;

public class MultiException {

    public static void main(String[]args){

        File multiExcepTest = new File("/Users/lwinphyo/Desktop/Access to Application Tool for Lwin Phyo.pdf");

        MyReader mr = new MyReader();

        try {
            mr.readFromFile(multiExcepTest);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class MyReader{

    public void readFromFile(File file) throws FileNotFoundException, ClassNotFoundException {

        int errorCode = 1;
        if(errorCode == 2){
            FileNotFoundException ex = new FileNotFoundException("File MA SHI BUU");
            throw ex;
        }
        else if(errorCode == 2){
            ClassNotFoundException ex = new ClassNotFoundException("Class MA SHI par bya");
            throw ex;
        }

        System.out.println("Continue loading process ... ");
    }
}

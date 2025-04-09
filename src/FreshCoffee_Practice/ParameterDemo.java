package FreshCoffee_Practice;

public class ParameterDemo {

    public static void main(String[]args){

        ParameterDemo my = new ParameterDemo();

        my.myMethod("Hi there");
        my.myMethod("Lwin");
        my.myMethod("Ko");


    }

    void myMethod(String fname){
        System.out.println(fname + " Phyo");
    }
}

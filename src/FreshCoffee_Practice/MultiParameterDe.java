package FreshCoffee_Practice;

public class MultiParameterDe {

    public static void main(String[]args){

        myMethod("Lwin Phyo",25);
        myMethod("SSS", 29);

    }

    static void myMethod(String name, int age){

        System.out.printf("\nHi there, I am %s and %d years old\n",name,age);

    }
}

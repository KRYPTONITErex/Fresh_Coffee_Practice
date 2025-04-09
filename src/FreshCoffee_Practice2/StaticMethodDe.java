package FreshCoffee_Practice2;

public class StaticMethodDe {

    static void writeAny(){
        System.out.println("Hi there, this is static Method.");
    }

    public void writeSomething(){
        System.out.println("Hay, You did created the new Object.");
    }

    public static void main(String[]args){

        writeAny();

        StaticMethodDe std = new StaticMethodDe();
        std.writeSomething();

    }
}



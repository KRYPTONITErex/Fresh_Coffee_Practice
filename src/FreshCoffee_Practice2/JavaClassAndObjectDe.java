package FreshCoffee_Practice2;
//multi class and object

public class JavaClassAndObjectDe {

    public static void main (String[]args){

//        Computer comp = new Computer();
//        comp.calculate();

        Laptop lpt = new Laptop();
        lpt.calculate();
        lpt.lptLooks();

    }
}


class Computer{
    String computerIs = "Calculating Devices";
    int keyboardQty = 1;

    private int displayScreen = 1;

    protected void calculate(){
        System.out.println("it can calculate very Fast.");
    }
}

class Laptop extends Computer{
    protected void calculate(){
        super.calculate();
        System.out.println("Modern Laptop can calculate more faster.");
    }
    protected void lptLooks(){
        System.out.println("Lpt is also a "+super.computerIs);
        System.out.printf("It has %d keyboard.",super.keyboardQty);
    }
}


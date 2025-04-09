package FreshCoffee_Practice2;

public class JavaConstructorsDe {
    public static void main(String[]args){

        Main main = new Main();
        System.out.println(main.x);

        Second sec = new Second(19);
//        System.out.println(sec.y);
        System.out.println("The input y of yours is : "+ sec.y);

        Laptops lpt = new Laptops("DELL",2024);
        lpt.displaySpec();

        Laptops lpt1 = new Laptops("MacBook",2025);
        lpt1.displaySpec();
    }
}
class Main{
    int x;

    Main(){
        x=5;
    }
}
class Second{
    int y;

    Second(int y){
        this.y = y;
    }
}

class Laptops{
    String brand;
    int modelYear;

    Laptops(String brand, int modelYear){
        this.brand = brand;
        this.modelYear = modelYear;
    }

    void displaySpec(){
        System.out.println("\nThis Laptop is "+brand+" produced @ "+modelYear);
    }
}
package FreshCoffee_Practice2;

public class JavaInheritanceDe {

    public static void main(String[]args){

        VCar vc = new VCar();
        vc.honk();
        vc.displaySpec();

    }
}

class Vehicle{   //if final class -> cannot extend more
    protected String brand = "Toyota";
    void honk(){
        System.out.println("\nPwamm Pwammm!!");
    }
}
class VCar extends Vehicle{
    String modelName = "Vios";
    int modelYear = 2018;

    void displaySpec(){
        System.out.println("Main Brand is \t\t\t- "+super.brand);
        System.out.println("Sub-model name called \t- "+modelName);
        System.out.println("Sub-model year \t\t\t- "+modelYear);
    }
}

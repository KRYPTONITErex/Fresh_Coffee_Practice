package FreshCoffee_Practice;

public class ConstructorDemo {
    int x;

    public ConstructorDemo(){
        x=5;
    }

    public static void main(String [] args){

        ConstructorDemo myObj = new ConstructorDemo();
        System.out.println(myObj.x);

        laptop lptNO = new laptop("Dell");
//        System.out.println(lptNO);

        laptop lpt = new laptop("Lenovo");
//        System.out.println(lpt);

        laptop lptModel = new laptop("MacBook", 2022);
    }
}

class laptop{
    String brand;

//    laptop(){
//        brand = "Dell";
//        System.out.println("No Constructor brand name is "+ brand);
//    }

    laptop(String name){
        brand = name;
        System.out.println("Laptop brand name is "+ name);
    }

    laptop(String brand, int model_year){
        System.out.println("This laptop is " + brand + " & released at "+ model_year);
    }
}




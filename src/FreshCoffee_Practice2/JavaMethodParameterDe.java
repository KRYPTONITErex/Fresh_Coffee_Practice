package FreshCoffee_Practice2;

public class JavaMethodParameterDe {

    static void myMethod(String name){
        System.out.println("Your input name is "+ name);
    }

    static void urMethod (String name, int age, double salary){
        System.out.printf("\nYour name is %s , %d years old & get %.2f",name,age,salary);
    }

    public static void main(String []args){
        myMethod("Lwin"); myMethod("Phyo");
        urMethod("John",27,33.33);

    }
}

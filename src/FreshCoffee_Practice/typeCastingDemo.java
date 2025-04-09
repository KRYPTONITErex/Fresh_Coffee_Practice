package FreshCoffee_Practice;

public class typeCastingDemo {
    public static void main(String[]args){

        double myDouble = 9.78d;
        int myInt = (int)myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);

        int urInt = 9;
        double urDouble = (int) urInt;

        System.out.println("\n"+urInt);
        System.out.println(urDouble);

        int time = 10;
        String res = (time < 18) ? "Good Day" : "Bad Day";
        System.out.println(res);

        int age = 19;
        String young = (age<18) ? "Young" : "Old";
        System.out.println(young);
    }
}

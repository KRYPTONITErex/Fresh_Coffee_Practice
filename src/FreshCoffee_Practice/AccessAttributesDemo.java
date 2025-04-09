package FreshCoffee_Practice;

public class AccessAttributesDemo {

    int x=3;
    String name = "Lwin Phyo";

    public static void main(String[]args){

        AccessAttributesDemo AA = new AccessAttributesDemo();
        AccessAttributesDemo AB = new AccessAttributesDemo();
//        AA.x=7;
        AB.x=9;
        System.out.println("AA x is : " + AA.x);
        System.out.println("AB x is : " + AB.x);
        System.out.println("AA name is : " + AA.name);

//        System.out.println(x);

        testX tx = new testX();
        testX txy = new testX();
//        System.out.println(tx.X);
//        tx.X = 40;
        txy.X=35;
        System.out.println(tx.X);
        System.out.println(txy.X);
        System.out.println("tx name is " + tx.name);

    }
}

class testX{
    int X = 30;
    String name = "SoeSeeSeim";
}
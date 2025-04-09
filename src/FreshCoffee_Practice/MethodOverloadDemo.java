package FreshCoffee_Practice;

public class MethodOverloadDemo {

    public static void main(String [] args){

        double db = plusMethod(2.3,5.3);
        int it = plusMethod(4,5);
        System.out.println("db is " + db + " and it is " + it);

    }

    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

}

package FreshCoffee_Practice2;
//Method Overloading - same Method (different Parameter);
public class JavaMethodOverloadingDe {
    static int calMethod(int x, int y){
        int z = x + y;
        System.out.println(z);
        return z;
    }

    static float calMethod(float x){
        System.out.println(x);
        return x;
    }

    static double calMethod(double x, double y){
        double z = x + y;
        System.out.println(z);
        return z;
    }

    public static void main(String[]args){

        calMethod(2,3);
        calMethod(1.4,3.2);
        calMethod(1.2345f);

    }
}

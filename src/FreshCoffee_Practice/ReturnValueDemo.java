package FreshCoffee_Practice;

public class ReturnValueDemo {

    public static void main(String [] args){

        int result = myMethod(3);
        System.out.println("my result is : " + result);

        TwoP tp = new TwoP();
        int result2 = tp.yourMethod(2,3);
        System.out.println("your result is : " + result2);

    }

    static int myMethod(int x){
        return 5+x;
    }

}

class TwoP{
    static int yourMethod(int x, int y){
        return x + y;
    }
}

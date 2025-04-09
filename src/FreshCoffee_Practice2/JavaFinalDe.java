package FreshCoffee_Practice2;

public class JavaFinalDe {

    int x = 10;
    static final int y = 20;

    public static void main(String[]args){

        JavaFinalDe ftest = new JavaFinalDe();
        System.out.println(ftest.x);
        System.out.println(ftest.y);

        ftest.x = 30;
//      ftest.y=40;
        System.out.println(ftest.x);
        System.out.println(ftest.y);

        testingFinal TF = new testingFinal();
        System.out.println(TF.a);
        System.out.println(TF.b);
        TF.a = 9;
//      TF.b = 12;
        System.out.println(TF.a);
        System.out.println(TF.b);

    }
}

class testingFinal{
    int a = 3;
    static final int b = 6;
}

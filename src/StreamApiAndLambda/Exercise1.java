package StreamApiAndLambda;

public class Exercise1 {

    public static void main(String[]args){



    }

    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello , Lambda! ");
        }
    };

    Runnable r1 = ()-> System.out.println("Hello, Lambda! ");
}



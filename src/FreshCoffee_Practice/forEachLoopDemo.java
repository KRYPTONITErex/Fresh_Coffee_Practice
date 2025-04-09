package FreshCoffee_Practice;

public class forEachLoopDemo {

    public static void main(String[]args){

        String[]cars = {"Volvo","Honda","Ford"};
//        System.out.println(cars[1]);
//        System.out.println(cars[2]);

//        for(int i=0; i<cars.length; i++){
//            System.out.println(cars[i]);
//        }

        for( String i : cars ){
            System.out.println(i);
        }

        int[]myNumbers = {1,2,3,4,5,6,7,8,9};

        for( int i : myNumbers){
            System.out.println(i);
        }
    }
}

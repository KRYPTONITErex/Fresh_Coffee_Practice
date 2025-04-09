package FreshCoffee_Practice;

public class eNumDemo {
    public static void main(String []args){

//        Level myVar = Level.LOW;
//        System.out.println(myVar);

//        switch (myVar){
//            case LOW :
//                System.out.println("LOW LEVEL");
//                break;
//            case HIGH :
//                System.out.println("HIGH LEVEL");
//                break;
//            case MEDIUM :
//                System.out.println("MEDIUM LEVEL");
//                break;
//        }

        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }

    }
}

enum Level{
    LOW, HIGH, MEDIUM
}


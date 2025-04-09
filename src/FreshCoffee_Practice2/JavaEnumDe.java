package FreshCoffee_Practice2;

public class JavaEnumDe {

    enum Level{ LOW , HIGH , MEDIUM }

    public static void main(String[]args){

        Level myLevel = Level.MEDIUM;

        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }

        switch(myLevel){
            case LOW:
                System.out.println("my Level is : "+myLevel);
                break;
            case MEDIUM:
                System.out.println("my Level is : "+myLevel);
                break;
            case HIGH:
                System.out.println("my Level is : "+myLevel);
        }

    }
}



package FreshCoffee_Practice;

public class arrayDemo {

    public static void main (String[]args){

        int [] ages = {20,30,40,50,33,23,53,64,78,34};

        double avg, sum = 0;
        int length = ages.length;
        System.out.println(length);

        for(int age : ages){
            sum += age;
        }
        avg = sum/length;
        System.out.println(avg);


        int lowestAge = ages[0], highesetAge = ages[0];
        for (int age : ages ){
            if(lowestAge > age ){
                lowestAge = age;
            }
        }
        System.out.println("\n"+lowestAge);

        for(int age : ages ){
            if(highesetAge<age){
                highesetAge=age;
            }
        }
        System.out.println(highesetAge);


        double HNL = (highesetAge+lowestAge)/length;
        System.out.println(HNL);

    }
}

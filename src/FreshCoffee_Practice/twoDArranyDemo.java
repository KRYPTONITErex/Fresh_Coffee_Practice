package FreshCoffee_Practice;
import java.util.Arrays;

public class twoDArranyDemo {

    public static void main(String[]args){

        int[][]numbers = {{1,2,3},{7,8,9}};
        System.out.println(numbers[0][1]);

        numbers[1][2] = 5;
        System.out.println(numbers[1][2]);

        for(int[] numb : numbers){
            System.out.println(Arrays.toString(numb));
        }

    }
}

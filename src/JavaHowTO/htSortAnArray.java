package JavaHowTO;
import java.util.Arrays;

public class htSortAnArray {

    public static void main(String[]args){

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        Arrays.sort(cars);
        System.out.println(cars.length);

        for(int i = 0; i < cars.length; i++){
            System.out.print(cars[i]+" ");
        }

        System.out.println("");
        for(String i : cars){

            System.out.print(i + "  ");
        }
    }

}

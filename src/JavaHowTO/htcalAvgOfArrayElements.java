package JavaHowTO;

import java.util.Arrays;
import java.util.Collections;

public class htcalAvgOfArrayElements {

    public static void main(String[]args){

        int[]ages = {10,20,30,40,50,60,70,80,90,100};

        float avg, sum = 0;

        int length = ages.length;
        System.out.println(length);

        for(Integer age : ages){
//            System.out.println(age);
            sum += age;
        }

        avg = sum / length;

        System.out.println(avg);

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        Integer[] ageObj = Arrays.stream(ages).boxed().toArray(Integer[]::new);
        Arrays.sort(ageObj, Collections.reverseOrder());

        System.out.println("DecendOrder : " + Arrays.toString(ageObj));

        //find max and min
        int lowsetAge = ageObj[0];


        for(int age : ageObj ){
            if(lowsetAge > age){
                lowsetAge = age;
            }
        }
        System.out.println("Lowest age is : "+lowsetAge);


        int highestAge = ages[0];
        for(int age : ages){
            if(highestAge < age){
                highestAge = age;
            }
        }
        System.out.println("Highest age is : "+highestAge);






    }
}

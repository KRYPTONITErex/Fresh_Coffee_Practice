package JavaHowTO;

public class htCalSumofAnArray {

    public static void main(String[]args){

        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum = 0;
        System.out.println(myArray.length);

        for (int i = 0; i < myArray.length; i++){

            sum += myArray[i];

        }
        System.out.println(sum);


        int[] urArray = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
        int sum2 = 0;
        for(int i=0; i<urArray.length; i++){

            sum2 += urArray[i];
        }
        System.out.println("Sum of urArry total is : "+sum2);
    }
}

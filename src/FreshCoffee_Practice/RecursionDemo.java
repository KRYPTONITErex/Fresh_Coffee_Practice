package FreshCoffee_Practice;

public class RecursionDemo {

    public static void main(String[]args){

        int result = sum(5);
        System.out.println(result);

        int result2 = sumStdEnd(0,5);
        System.out.println(result2);

    }

    static int sum(int k){
        if(k>0){
        return k + sum(k-1);
        }else {
            return 0;
        }
    }

    static int sumStdEnd(int start,int end){
        if(end>start){
            return end + sumStdEnd(start, end-1);
        }else {
            return end;
        }
    }

}

package FreshCoffee_Practice2;

public class JavaRecursionDe {
    static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }else {
            return 0;
        }
    }

    static int cal(int start, int end){
        if(end>start){
            return end + cal(start,end-1);
        }else {
            return end;
        }
    }

    public static void main(String []args){

        int res = sum(5);
        System.out.println(res);

        int calRes = cal(0,5);
        System.out.println(calRes);

    }
}

package FreshCoffee_Practice2;

public class JavaReturnDe {
    static int sum(int x, int y){
        int result = x+y;
        System.out.println(result);
        return result;
    }
    public static void main(String []args){

        sum(2,3);

        multiply.multiple(2,3);
//        multiply mu = new multiply();
        multiply.multiple(3,5);

    }
}

class multiply{
    static int multiple(int x,int y){
        int res = x*y;
        System.out.println(res);
        return res;
    }
}

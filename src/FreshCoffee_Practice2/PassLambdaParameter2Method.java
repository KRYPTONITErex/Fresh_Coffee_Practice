package FreshCoffee_Practice2;

public class PassLambdaParameter2Method {

    public static void main(String[]args){

        //lamdbaExpression
        StringFunction exclaim = s-> s+"!";
        StringFunction ask = s-> s+"?";
        StringFunction upper = s-> s.toUpperCase();

        //call method with lambda
        printFormatted("Hello", upper);
        printFormatted("Hello", upper);

    }

    interface StringFunction{
        String run(String str);
    }

    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
}




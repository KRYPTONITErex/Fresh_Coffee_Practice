package FreshCoffee_Practice2;

public class Combine2StringWifLambda {

    public static void main(String[]args){

        StringCombiner sc = (s1,s2)->(s1+" "+s2);
        System.out.println(sc.combine("Hello", "World"));
    }
}

interface StringCombiner{
    String combine(String s1,String s2);
}


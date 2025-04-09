package FreshCoffee_Practice2;

public class testDe {

    public static void main(String []args){

//        Integer a = 127;
//        Integer b = 127;
//
//        System.out.println(a); System.out.println(b);
//        System.out.println( a == b);
//
//        Integer c = 128;
//        Integer d = 128;
//
//        System.out.println(c); System.out.println(d);
//        System.out.println( c == d ); //
//        System.out.println( c.equals(d));
//
//        Short s1 = 100;
//        Short s2 = 100;
//
//        System.out.println( s2 == s1 );
//        System.out.println(s1.equals(s2));
//
//        Short s3 = 128;
//        Short s4 = 128;
//
//        System.out.println(s3==s4);
//        System.out.println(s3.equals(s4));

        String str1 = new String("Hello");
        String str2 = str1;
        String str3 = "Hello";

        System.out.println(str1);
        System.out.println(str1==str2);
        System.out.println(str3==str1);
        System.out.println(str3.equals(str1));
        System.out.println(str3.equals(str2));


        String str5 = "Hi There";
        String str6 = str5;

        str6 = "User Name";
        System.out.println(str5);
        System.out.println(str6);

        String STR = "hiHelllo";
        String STR2 = STR;

        STR2 = "hi how u doing";

        System.out.println(STR);
        System.out.println(STR2);

        StringBuilder sb = new StringBuilder("LWIN");
        sb.append(" PHYO");
        System.out.println(sb);
    }

}

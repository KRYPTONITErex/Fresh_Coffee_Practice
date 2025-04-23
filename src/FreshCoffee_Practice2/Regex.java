package FreshCoffee_Practice2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[]args){

//        Pattern pattern = Pattern.compile("\s");
//        Matcher matcher = pattern.matcher("sdfsd a bc efd");
//        boolean matchFound = matcher.find();
//        System.out.println(matchFound);

//        Pattern p = Pattern.compile("\\d{3}");
//        Matcher m = p.matcher("abc123xyz");
////        System.out.println(m.find());
//
//        boolean digitFound = m.find();
//        System.out.println(digitFound);

//        Pattern pH = Pattern.compile("^Hello");
//        Matcher mH = pH.matcher("Hello World!!");
//        boolean mHFound = mH.find();
//        System.out.println(mHFound);

//        // . matches any character in between
//        Pattern p1 = Pattern.compile("a..c");
//        Matcher m1 = p1.matcher("annc");
//        System.out.println(m1.find());

//        // to find last input $ sign
//        Pattern p2 = Pattern.compile("world$");
//        Matcher m2 = p2.matcher("Hi there all world");
//        boolean m2Found = m2.find();
//        System.out.println(m2Found);

//        //not include character
//        Pattern p3 = Pattern.compile("[^anc]");
//        Matcher m3 = p3.matcher("oa");
//        boolean m3Found = m3.find();
//        System.out.println(m3Found); //found o not include anc , --> true

//        //to find n times
//        Pattern p4 = Pattern.compile("\\d{4}"); //digit 4 times
//        Matcher m4 = p4.matcher("124");
//        System.out.println(m4.find());

//        //to check .com at last
//        Pattern p5 = Pattern.compile(".*\\.com$");
//        Matcher m5 = p5.matcher("www.lwin@gmail.com");
//        System.out.println(m5.find());

//        //to check 3 small letter , 2 digit password
//        Pattern p6 = Pattern.compile("[a-z]{3}\\d{2}");
//        Matcher m6 = p6.matcher("abcdef12345");
//        System.out.println(m6.find());

//        //to check Gmail | outlook address
//        Pattern p7 = Pattern.compile("^[a-zA-Z0-9._%+-]+@(gmail|yahoo|outlook)\\.com$");
//        Matcher m7 =p7.matcher("LwinPhyo271395@outlook.com");
//        System.out.println(m7.find());


//        //to check repeat of aaa bbb
//        Pattern p8 = Pattern.compile("(.)\\1+");
//        Matcher m8 = p8.matcher("aaa bbb ccc ddd");
//        System.out.println(m8.find());

//        //to check Phone number 09-779985526
//        Pattern p9 = Pattern.compile("^09-[0-9]");
//        Pattern p91 = Pattern.compile("^09-\\d{7,9}$");
//        Matcher m91 = p91.matcher("09-425830013");
//        System.out.println(m91.find());

//        //to check plate number like 4N-4373
//        Pattern p10 = Pattern.compile("^[0-9]{1,2}[A-Z]{1,2}\\s?-\\s?[0-9]{4}$");
//        Matcher m10 = p10.matcher("4N - 4373");
//        System.out.println(m10.find());

        //to check password with 1least Capital letter, 1 number and 8 characters
        Pattern p11 = Pattern.compile("^(?=.*[A-Z])(?=.*\\d{2,})(?=.*[!@#$%^&*()]).{8,}$");
        Matcher m11 = p11.matcher("LwinPhyo271395!");
        System.out.println(m11.find());



    }
}


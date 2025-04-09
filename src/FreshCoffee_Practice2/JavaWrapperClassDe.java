package FreshCoffee_Practice2;

import java.util.ArrayList;

public class JavaWrapperClassDe {

    public static void main(String[]args){

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());

        Integer urInt = 100;
        String urString = urInt.toString();
        System.out.println(urString);
        System.out.println(urString.length());
        System.out.println(urInt);
        System.out.println(urInt.doubleValue());

    }
}

/* Wrapper Class --> provide a way to use primitive data type as OBJECTS.
Byte
Short
Integer
Long
Float
Double
Boolean
Character
//must use wrapper when using with ArrayList(list can only store objects)
 */

//ArrayList<int> myNumb = new ArrayLsit<int>(); can't use
//ArrayList<Integer> myNumb = new ArrayList<>();  ok to use


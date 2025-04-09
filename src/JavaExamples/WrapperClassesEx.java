package JavaExamples;

import java.util.ArrayList;

public class WrapperClassesEx {
    public static void main(String[]args){

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(30);
        myNumbers.add(35);

        for(int i : myNumbers){
            System.out.print(i+" - ");
        }

        System.out.println();
        for(int i=0; i<myNumbers.size(); i=i+2){
            System.out.print(myNumbers.get(i)+" - ");
        }

        Integer myInt = 100;
        Double myDouble = 5.99;
        Character myChar = 'A';
        StringBuilder myString = new StringBuilder("Hello");
        Boolean myBoolean = true;
        Float myFloat = 3.14f;
        Short myShort = 500;
        Byte myByte = 5;
        Long myLong = 1000000L;
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        System.out.println(myString.toString());
        System.out.println(myBoolean.booleanValue());
        System.out.println(myFloat.floatValue());
        System.out.println(myShort.shortValue());
        System.out.println(myByte.byteValue());
        System.out.println(myLong.longValue());
        System.out.println(myInt.SIZE);
        System.out.println(myDouble.SIZE);
        System.out.println(myChar.SIZE);
        System.out.println(myString.length());
//        System.out.println(myBoolean.SIZE);
        System.out.println(myFloat.SIZE);
        System.out.println(myShort.SIZE);
        System.out.println(myByte.SIZE);
        System.out.println(myLong.SIZE);
        System.out.println(myInt.MAX_VALUE);
    }
}

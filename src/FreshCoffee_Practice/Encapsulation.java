package FreshCoffee_Practice;

public class Encapsulation {
    public static void main(String[]args){

        Author au = new Author("Ko Tar","kotar@gmail.com",'m');
        System.out.println(au);
        au.setEmail("Lwin@gmail.com");
        au.setName("Lwin");
        System.out.println(au);

        Book aBook = new Book("Java SE", au, 19.95, 1000);
        System.out.println(aBook);

        //primitive
        int x = 10;
        int y = x;
        x = 20;
        System.out.printf("\nx= %d  &  y = %d\n\n",x,y);

        //
        String str = new String("data");
        str += " Type";
        System.out.println(str);

        //reference1
        StringBuilder a = new StringBuilder("Hello");
        StringBuilder b = a;
        a.append(" WORLD");
        System.out.printf("\na = %s  &  b = %s\n", a, b);

        //reference2
        Student s1 = new Student("Lwin");
        Student s2 = s1;

        s2.setName("KO Phyo");
        System.out.println("s1 name : " + s1.getName());
        System.out.println("s2 name : " + s2.getName());

        //int value = null;
        //cannot be null as it is primitive type
        Integer value1 = null;

//       int c = value1 +5;

        if(value1!=null){
            int c = value1 + 5;
            System.out.println(c);
        }else {
            System.out.println("\nvalue1 is null");
        }


        int count = 5; //primitive int
        Integer count2 = 6; //ref to an Integer(wrapper class) autoboxing
        System.out.println(count);
        System.out.println(count2);

        int num = 5;
        StringBuilder text = new StringBuilder("Hello");
        ModifyValues.modifyValues(num, text);
        System.out.println("num = " + num + ", text = " + text);

    }

}


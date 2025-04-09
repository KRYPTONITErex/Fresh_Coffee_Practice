package FreshCoffee_Practice;

public class AbstractclassDemo {
    public static void main (String[]args){

        Students stu = new Students();
        System.out.println(stu.fname);
        System.out.println(stu.age);
        System.out.println(stu.graduationYear);
        stu.study();

        newStudent ns = new newStudent();
        System.out.println(ns.newSname);

        grStudent gs = new grStudent();
        System.out.println(gs.gStuName);
        gs.study();
        System.out.println(gs.fname);

    }
}

abstract class Main{
    String fname = "Lwin";
    int age = 25;
    abstract void study(); //abstract method
}

class Students extends Main{
    int graduationYear = 2022;
    void study(){
        System.out.println("study all day long\n");
    }
}

class newStudent extends Students{
    String newSname = "Phyo";
//    void study(){
//        System.out.println("study 2 hr a day");
//    }
}

class grStudent extends Main{
    String gStuName = "\nAudra";
    void study(){
        System.out.println("Girl study 6 hr a day");
    }
}

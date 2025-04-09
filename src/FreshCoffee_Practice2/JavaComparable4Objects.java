package FreshCoffee_Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaComparable4Objects {

    public static void main(String[]args){

        List<studentobj> stu = new ArrayList<studentobj>();
        stu.add(new studentobj("John", 20));
        stu.add(new studentobj("Jane", 18));
        stu.add(new studentobj("Alice", 22));
        stu.add(new studentobj("Bob", 19));
        stu.add(new studentobj("Eve", 21));

        System.out.println(stu);
        Collections.sort(stu);
        System.out.println(stu);
    }
}

class studentobj implements Comparable<studentobj>{
    String name; int id;
    studentobj(String n, int id){
        name = n; this.id=id;
    }
    @Override
    public int compareTo(studentobj o) {
        if(id>o.id){return -1;};
        if(id<o.id){return 1;}
        return 0;
    }
    public String toString(){
        return "Student Name: " + name + " : " + id;
    }
}
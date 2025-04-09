package FreshCoffee_Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentObjSorting {

    public static void main(String[] args) {

        List<Students> studentList = new ArrayList<>();
        studentList.add(new Students("Ko Sai", 30, "Yangon"));
        studentList.add(new Students("Ko Ko", 25, "Mandalay"));
        studentList.add(new Students("Su Su", 27, "Magway"));
        studentList.add(new Students("Mg Mg", 23, "Naypyidaw"));
        studentList.add(new Students("Aung Aung", 28, "Bago"));

        System.out.println(studentList);
        for(Students stu : studentList){
            System.out.println(stu);
        }
//        Collections.sort(studentList);

//        Collections.sort(studentList, new sortByAge());

        Collections.sort(studentList,new sortWithCompareTo());

        System.out.println("After Sorting");
        for(Students stu : studentList){
            System.out.println(stu);
        }

    }
}

class Students {
    public String name;
    public int age;
    public String liveIn;

    public Students(String name, int age, String liveIn) {
        this.name = name;
        this.age = age;
        this.liveIn = liveIn;
    }

    public String toString() {
        return "Student Data: " + name + " : " + age + " : " + liveIn;
    }

}

//class sortByAge implements Comparator<Students> {
//
//    @Override
//    public int compare(Students o1, Students o2) {
//        if(o1.age>o2.age){
//            return 1;
//        } else if (o1.age<o2.age) {
//            return -1;
//        }
//        return 0;
//    }
//}

//testing with compareTo
class sortWithCompareTo implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return -o1.name.compareTo(o2.name);
    }
}
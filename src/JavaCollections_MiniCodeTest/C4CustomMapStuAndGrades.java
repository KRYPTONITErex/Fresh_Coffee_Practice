package JavaCollections_MiniCodeTest;

import java.util.HashMap;
import java.util.Map;

public class C4CustomMapStuAndGrades {

    public static void main(String[] args) {

        Map<Integer, C4Student> studentGrades = new HashMap<>();
        studentGrades.put(101, new C4Student("Alice", "A"));
        studentGrades.put(102, new C4Student("Bob", "B"));
        studentGrades.put(103, new C4Student("Charlie", "A"));

        //add new student
        studentGrades.put(104, new C4Student("David", "C"));

        for(Map.Entry<Integer, C4Student> studentGrade : studentGrades.entrySet()){
            System.out.println(studentGrade.getValue().getName() + "'s grade: " + studentGrade.getValue().getGrade());
        }

        //to find student ID 104
        System.out.println("\nGrade for student's ID 104 " + ": " + studentGrades.get(104));

        //to remove student ID 104
        studentGrades.remove(104);
        System.out.println("\nAfter removing student ID 104: "+studentGrades);

        //to update student ID 101's grade tp D
        studentGrades.get(101).setGrade("D");
        System.out.println("\nStudent's ID 101 grade A-->D : "+studentGrades.get(101).getGrade());

    }

}

class C4Student {
    private String name;
    private String grade;

    public C4Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return  grade;
    }
}

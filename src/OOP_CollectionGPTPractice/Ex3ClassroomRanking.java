package OOP_CollectionGPTPractice;

import java.util.HashMap;
import java.util.Map;

public class Ex3ClassroomRanking {

    public static void main(String[]args){

        Student4Ex3 stu1 = new Student4Ex3("Lwin");
        stu1.addGrade("Math", 70);
        stu1.addGrade("Science", 85);
        stu1.addGrade("History", 65);

        System.out.println(stu1.toString());

        Student4Ex3 stu2 = new Student4Ex3("Phyo");
        stu2.addGrade("Math", 80);
        stu2.addGrade("Science", 75);
        stu2.addGrade("History", 70);

        System.out.println(stu2.toString());
    }
}

class Student4Ex3{
    private String name;

    public Student4Ex3(String name){
        this.name = name;
    }

    private Map<String, Integer> grades = new HashMap<>();

    void addGrade(String sub,int grad){
        grades.put(sub,grad);
    }

    double getAverageGrade(){
        int size = grades.size();
        double sum = 0;
        for(Map.Entry<String,Integer> entry : grades.entrySet()){
            int grade = entry.getValue();
            sum = sum + grade;
        }
        return sum/size;
    }

    public void displayGrades(){
        for(Map.Entry<String, Integer> entry : grades.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

  public String toString(){
    return String.format("Average marks is %.2f for %s calculated based on %s",
                        getAverageGrade(),
                        name,
                        grades.toString()
                              .replaceAll("[{}]", ""));  // removes curly braces
    }
}

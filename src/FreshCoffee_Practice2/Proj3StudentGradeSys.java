package FreshCoffee_Practice2;

import java.util.*;

public class Proj3StudentGradeSys {

    public static void main(String[]args){

        //create students
        StudentObj stu1 = new StudentObj("Lwin","S01");
        StudentObj stu2 = new StudentObj("Phyo", "S02");
        StudentObj stu3 = new StudentObj("Aung", "S03");

        //add grades
        stu1.addGrade("Math", 90);
        stu1.addGrade("Science", 85);
        stu1.addGrade("English", 80);

        stu2.addGrade("Math", 85);
        stu2.addGrade("Science", 90);
        stu2.addGrade("English", 75);

        stu3.addGrade("Math", 80);
        stu3.addGrade("Science", 95);
        stu3.addGrade("English", 85);

        //Store Students
        List<StudentObj> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        //sort by avg grade
        students.sort(Comparator.comparingDouble(StudentObj::getAvgGrade).reversed());

        //display top 3 students
        System.out.println("Top 3 students: ");
        for(int i = 0; i < Math.min(3,students.size()); i++){
            StudentObj student = students.get(i);
            //with .2f
            System.out.printf("%s - Average : %.2f\n", student, student.getAvgGrade());
        }
    }
}

class StudentObj{
    private String name;
    private String ID;
    private Map<String,Integer> grades = new HashMap<>();


    public StudentObj(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName(){return name;}
    public String getID(){return ID;}
    public Map<String,Integer> getGrades(){return grades;}

    public void addGrade(String subject, int grade){
        grades.put(subject,grade);
    }

    public double getAvgGrade(){
        int total = 0;
        for(int grade : grades.values()){
            total +=  grade;
        }
        return grades.size() == 0? 0 : total/(double)grades.size();
    }

    public String toString(){
        return name + " (" + ID + ") ";
    }
}


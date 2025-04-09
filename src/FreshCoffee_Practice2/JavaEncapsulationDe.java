package FreshCoffee_Practice2;

public class JavaEncapsulationDe {
    public static void main(String[]args){

        Student stu = new Student();
        System.out.println("");
        stu.displayInfo("Lwin",9,4.75);

        Student stu2 = new Student();
        stu2.displayInfo("Phyo",7,4.25);

        Student stu3 = new Student();
        stu3.displayInfo("Avrial",8,4.5);
    }
}

class Student{
    private String name;
    private int id;
    private double totalScore;

    void displayInfo(String name, int id, double totalScore){
        System.out.println("Student name is : "+name+" with ID : "+id+" get "+totalScore+" marks.");
    }

    String getName(){return name;}
    int getId(){return id;}
    double getTotalScore(){return totalScore;}

    void setName(String name){this.name=name;}
    void setId(int ID){this.id = ID;}
    void setTotalScore(double score){this.totalScore=score;}
}
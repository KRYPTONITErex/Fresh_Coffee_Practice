package StreamApiAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArtCodePredicate {

    public static void main(String[]args){

        List<Students> Students = getStudentsList();

        Predicate<Students> isAdult = s->s.getAge()>=30;
        System.out.println(isAdult.test(Students.get(1)));

        Predicate<Students> isPassed = s->s.getScores()>=70;
        Predicate<Students> age20Above = s->s.getAge()>=20;

        Students Alice = Students.get(0);
        Predicate<Students> isAlice = Predicate.isEqual(Alice);

        List<Students> passedStudents = Students.stream()
//                .filter((isPassed).and(age20Above))
                .filter(isAlice)
                .collect(Collectors.toList());
//        System.out.println(passedStudents);
        passedStudents.forEach(System.out::println);

//        List<Students> students = getStudentsList();
//        System.out.println(students);

//        for(Students stu : students){
//            if(stu.getScores() >= 80){
//                System.out.println(stu.getName());
//            }
//        }

//        List<Students> PassedStudents = students.stream()
//                .filter(stu->stu.getScores()>=80)
//                .toList();
//
//        System.out.println(PassedStudents);
    }

    public static List<Students> getStudentsList(){
        return Arrays.asList(
                new Students("Alice", 20, 85),
                new Students("Bob", 22, 95),
                new Students("Charlie", 21, 35),
                new Students("David", 19, 75),
                new Students("Eve", 23, 65),
                new Students("Alice", 22, 95)
        );

//        return List.of(
//                new Students("Alice", 20, 85),
//                new Students("Bob", 22, 90),
//                new Students("Charlie", 21, 80),
//                new Students("David", 19, 95),
//                new Students("Eve", 23, 75)
//        );
    }
}

class Students{
    private String name;
    private int age;
    private int scores;

    Students(String name, int age, int scores){
        this.name = name; this.age = age; this.scores = scores;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public int getScores(){return scores;}

    public String toString(){
        return name + " \t- " + scores + " | age is " + age;
    }
}

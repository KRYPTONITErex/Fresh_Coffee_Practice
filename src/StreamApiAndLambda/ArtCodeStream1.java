package StreamApiAndLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArtCodeStream1 {

    public static void main(String[]args){
        List<Employee> employees = getEmployees();

//        List<Employee> selectedEmp = new ArrayList<>();
//        for(Employee e: employees){
//            if(e.getSalary()>20000){
//                selectedEmp.add(e);
//            }
//        }
//        selectedEmp.forEach(System.out::println);
//
//        System.out.println("===========");

        //using predicate interface --> predicate is a functional interface
        Predicate<Employee> p = e-> e.getSalary()>20000;

        List<Employee> selectedEmps = employees.stream()
//                .filter(e -> e.getSalary() > 20000)
                .filter(p)
                .collect(Collectors.toList());

        selectedEmps.forEach(System.out::println);
        System.out.println("----------------");

//        System.out.println(selectedEmp);
        System.out.println(selectedEmps);

    }

    public static List<Employee> getEmployees(){
        return List.of(
                new Employee("John", 10000),
                new Employee("Jack", 20000),
                new Employee("Jill", 30000),
                new Employee("Jenny", 40000),
                new Employee("Jen", 50000)
        );
    }

}

class Employee {
    private String name;
    private int salary;

    Employee (String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {return name;}
    public int getSalary() {return salary;}

    public String toString(){
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
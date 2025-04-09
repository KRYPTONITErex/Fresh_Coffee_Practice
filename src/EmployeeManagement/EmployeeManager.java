package EmployeeManagement;

public class EmployeeManager {

    public static void main(String[]args){

        Employee mgr = new Manager("William");
        mgr.work(); mgr.takeBreak(); //mgr.sameWorkplace();
        System.out.println(" ");

        Employee dev = new Developer("John");
        dev.work(); dev.takeBreak(); ((Developer) dev).sameWorkplace();
        System.out.println(" ");

        Employee designer =  new Designer("Mary");
        designer.work(); designer.takeBreak(); ((Designer) designer).sameWorkplace();
        System.out.println(" ");

       Person p = new normalPerson();
       p.eat(); p.breadth(); //((normalPerson) p).sameWorkplace();

        System.out.println(" ");

       Robot r = new RobotBrand();
       r.charging("Tesla");
       r.charging("Xiaomi");

       Robot r2 = new RobotBrand2();
       r2.charging("LG & Samsung");

       Person runner = new Runner();
       ((Runner) runner).runFast("Mr.Runner");
       runner.eat(); runner.breadth();
    }
}

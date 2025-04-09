package EmployeeManagement;

class Runner implements RunningFast, Person {
    @Override
    public void eat() {
        System.out.println(" He has to eat daily.");
    }

    @Override
    public void breadth() {
        System.out.println(" He has to sleep timely.");
    }

    @Override
    public void runFast(String AtheleteName) {
        System.out.println(" ");
        System.out.println(AtheleteName+" has to practice running fast");
    }
}

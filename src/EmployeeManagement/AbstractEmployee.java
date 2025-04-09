package EmployeeManagement;

abstract class AbstractEmployee implements Employee{


    private final String name;

    public AbstractEmployee(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public abstract void work();

    @Override
    public abstract void takeBreak();

    @Override
    public void eat() {
        System.out.println("we eat the cooked Foods.");
    }

    @Override
    public void breadth() {
        System.out.println("we breadth the same Air");
    }

    public void sameWorkplace(){
        System.out.println("We working in same company.");
    }
}

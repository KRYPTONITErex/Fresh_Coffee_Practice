package EmployeeManagement;

class Manager extends AbstractEmployee{

//    String name;
    public Manager(String name) {
//        this.name = name;
        super(name);
    }

    public void work(){
        System.out.println(getName()+" is managing the team.");
    }
    public void takeBreak(){
        System.out.println(getName()+" just take a short break.");
    }
}

class Developer extends AbstractEmployee{

//    String name;
    public Developer(String name) {
//        this.name = name;
        super(name);
    }

    public void work(){
        System.out.println(getName() + " is coding.");
    }
    public void takeBreak(){
        System.out.println(getName() + " is taking a Coffee break.");
    }
    public void sameWorkplace(){
        System.out.println("We working in same company.");
    }

}

class Designer extends AbstractEmployee{

//    String name;
    public Designer(String name) {
//        this.name = name;
        super(name);
    }

    public void work(){
        System.out.println(getName() + " is designing.");
    }
    public void takeBreak(){
        System.out.println(getName() + " is taking a Tea break.");
    }
    public void sameWorkplace(){
        System.out.println("We working in same company.");
    }

}

class normalPerson implements Person{

    @Override
    public void eat() {
        System.out.println("we eat the cooked Foods.");
    }

    @Override
    public void breadth() {
        System.out.println("we breadth the same Air");
    }

}

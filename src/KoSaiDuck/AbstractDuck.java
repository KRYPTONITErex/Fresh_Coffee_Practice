package KoSaiDuck;

abstract class AbstractDuck implements Animal,SwimBehaviour,FlyBehaviour,DisplayBehaviour, QuackBehaviour{

    String animalType;
    String name;
    AbstractDuck(String animalType,String name){
        this.animalType = animalType;
        this.name = name;
    }

    @Override
    public void sleeping() {
        System.out.println("Duck sleep.");
    }

    @Override
    public void eating() {
        System.out.println("Duck eat.");
    }

    @Override
    public void moving() {
        System.out.println("Duck move.");
    }

    @Override
    public void findingFood() {
        System.out.println("Duck find food.");
    }

    @Override
    abstract public void displayInfo();

    @Override
    abstract public void fly();

    @Override
    abstract public void swim();

    @Override
    abstract public void quack();
}

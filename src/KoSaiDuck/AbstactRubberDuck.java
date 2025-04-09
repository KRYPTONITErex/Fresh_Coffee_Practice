package KoSaiDuck;

abstract class AbstractRubberDuck implements SwimBehaviour,ToyBehaviour,DisplayBehaviour{

    String toyType;
    String name;
    AbstractRubberDuck(String toyType,String name){
        this.toyType = toyType;
        this.name = name;
    }

    @Override
    abstract public void displayInfo();

    @Override
    abstract public void swim();

    @Override
    public void toy() {

    }
}

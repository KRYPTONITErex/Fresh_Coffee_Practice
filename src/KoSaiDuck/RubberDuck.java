package KoSaiDuck;

public class RubberDuck extends AbstractRubberDuck{

    RubberDuck(String toyType,String name) {
        super(toyType,name);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is "+toyType+", named " + name);
        swim();
    }

    @Override
    public void swim() {
        System.out.println(toyType+" can swim.");
    }
}

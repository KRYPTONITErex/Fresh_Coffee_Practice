package KoSaiDuck;

public class Duck extends AbstractDuck{

    Duck(String animalType,String name) {
        super(animalType,name);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a "+animalType+" named "+name);
        eating(); quack(); fly(); swim();
    }

    @Override
    public void fly() {
        System.out.println(animalType+" can fly.");
    }

    @Override
    public void swim() {
        System.out.println(animalType+" can swim.");
    }

    @Override
    public void quack() {
        System.out.println(animalType+" can quack.");
    }
}

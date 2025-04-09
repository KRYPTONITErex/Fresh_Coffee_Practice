package FreshCoffee_Practice;

public class Multi_InterfaceDemo {
    public static void main(String[]args){
        cat cat = new cat();
        cat.animalSound(); cat.animalEat();

        cat myCat = new cat();
        cat.animalSound("Garrfiee"); cat.animalEat("My kitty");
    }
}
interface wildAnimal{
    void animalSound();
}
interface petAnimal{
    void animalEat();
}

class cat implements wildAnimal,petAnimal{
    public void animalSound(){
        System.out.println("sound like meow");
    }
    public void animalSound(String name){
        System.out.println(name + " sound like wooaa");
    }
    public void animalEat(){
        System.out.println("cat eat food\n");
    }
    public void animalEat(String name){
        System.out.println(name + " eat fish as fav food");
    }
}

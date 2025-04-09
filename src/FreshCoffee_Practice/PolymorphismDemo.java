package FreshCoffee_Practice;

public class PolymorphismDemo {
    public static void main(String[]args){

        Animal ani = new Animal();
        ani.liveIn();
        Lion lion = new Lion();
        lion.eat();
        lion.fight();
        Lion lion2 = new Lion();
        lion2.fight("male");
        rabbit rbb = new rabbit();
        rbb.eat();

    }
}

class Animal {

    String group = "Animal Gp";
    void liveIn(){
        System.out.println("Animal live in forest with their " + group);
    }
    void drink(){
        System.out.println("all drink water from the lake");
    }
    void eat(){
        System.out.println("All find and eat their suitable food\n");
    }
}

class Lion extends Animal{
    void eat(){
        System.out.println("\nLION hunt the weak animal for food");
    }
    void fight(){
        System.out.println("Female lion fight for food");
    }
    void fight(String gender){
        System.out.println(gender + " lion fight for fields");
    }
}

class rabbit extends Animal{
    void eat(){
        System.out.println("\nRabbit find the grass and plants for food");
    }
}

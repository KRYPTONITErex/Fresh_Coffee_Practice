package FreshCoffee_Practice2;

public class VariableShadowing {

    public static void main(String[]args){

//        wildAnimal wAnimal = new Cat();
//        System.out.println(wAnimal.name);
//        wAnimal.makeSound();
//
//        Cat cat = new Cat();
//        System.out.println(cat.name);
//        cat.makeSound();

        SuperClass sup = new SuperClass();
//        System.out.println(sup.x);

        SuperClass supC = new SubClass();
        System.out.println("line - 17 "+ supC.x);
        System.out.println("line - 18 "+ ((SubClass)supC).x);
//        supC.display();
//        System.out.println(supC.x);


        SubClass subC = new SubClass();
//        System.out.println("line - 21 "+subC.x);
        System.out.println(subC.x);

    }
}

class wildAnimal{
    String name = "Animal";
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Cat extends wildAnimal{
    String name = "Cat";
    void makeSound(){
        System.out.println("Cat meows");
    }
}

class SuperClass{
    int x = 10;
    void display(){
        System.out.println("SuperClass: " + x);
    }
}

class SubClass extends SuperClass{
    int x = 20;
    void display(){
        System.out.println("SubClass: " + x);
//        System.out.println("SuperClass: " + super.x);
    }
}

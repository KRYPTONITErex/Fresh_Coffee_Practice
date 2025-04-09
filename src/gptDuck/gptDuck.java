package gptDuck;
public class gptDuck {
    public static void main(String[]args){

        Duck mallardDuck = new MallardDuck("Donald Duck","Green",3);
//        mallardDuck.setName("Donald Duck");
//        mallardDuck.setColor("Green");
//        mallardDuck.setAge(3);
        mallardDuck.display();

        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.setName("Dooby Duck");
        rubberDuck.setColor("Yellow");
        rubberDuck.setAge(1);
        rubberDuck.display();

        System.out.println();

        Duck rubberDuck2 = new RubberDuck();
        rubberDuck2.setName("LP's toy duck");
        rubberDuck2.setColor("Blue");
        rubberDuck2.setAge(2);
        rubberDuck2.display();

        System.out.println();

        Duck mallardDuck2 = new MallardDuck("Daisy Duck","White",5);
//        mallardDuck2.setName("Daisy Duck");
//        mallardDuck2.setColor("White");
//        mallardDuck2.setAge(5);
        mallardDuck2.display();
    }
}



//package Ducks;

abstract class Duck implements InterDuck {

    private String name;
    private String color;
    private int age;

    public String getName(){ return name; }
    public String getColor(){ return color; }
    public int getAge(){ return age; }

    public void setName(String name){ this.name = name; }
    public void setColor(String color){ this.color = color; }
    public void setAge(int age){ this.age = age; }

    public void display(){
        System.out.println("Duck Information");
        System.out.println("- Name: " + getName() + " | - Color: " + getColor() + " | - Age: " + getAge());
        duckType();
        System.out.println();
        quack();
        System.out.println();
        fly();
        System.out.println();
        eat();
        System.out.println();
        swim();
        System.out.println();
    }

    public abstract void duckType();
    public abstract void quack();
    public abstract void fly();
    public abstract void eat();
    public abstract void swim();
}

//package Ducks;

class MallardDuck extends Duck {

    public MallardDuck(String name, String color, int age) {
        super.setName(name);
        super.setColor(color);
        super.setAge(age);
    }

    @Override
    public void duckType(){
        System.out.print("This is a Mallard Duck");
    }

    @Override
    public void quack(){
        System.out.print(" - can Quack");
    }

    @Override
    public void fly(){
        System.out.print(", can Fly");
    }

    @Override
    public void eat(){
        System.out.print(", can Eat");
    }

    @Override
    public void swim(){
        System.out.print(", can Swim\n");
    }
}

//package Ducks;

class RubberDuck extends Duck {

    @Override
    public void duckType(){
        System.out.print("This is a Rubber Duck");
    }

    @Override
    public void quack(){
        System.out.print(" - cannot quack");
    }

    @Override
    public void fly(){
        System.out.print(", cannot fly");
    }

    @Override
    public void eat(){
        System.out.print(", does not eat anything");
    }

    @Override
    public void swim(){
        System.out.print(", can float on water\n");
    }
}
package Ducks;

class MallardDuck extends Duck{

    public MallardDuck(String name, String color, int age) {
        super.setName(name); super.setColor(color); super.setAge(age);
    }

    public void duckType(){
        System.out.print("This is a Mallard Duck");
    }

    public void quack(){
        System.out.print("- can Quack");
    }

    public void fly(){
        System.out.print(", can Fly");
    }

    public void eat(){
        System.out.print(", can Eat");
    }

    public void swim(){
        System.out.print(", can Swim\n");
    }
}

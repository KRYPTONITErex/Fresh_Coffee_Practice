package Ducks;

class RubberDuck extends Duck{

    public RubberDuck(String name, String color, int age) {
        super.setName(name); super.setColor(color); super.setAge(age);
    }

    public void duckType(){
        System.out.print("This is a Rubber Duck");
    }

    public void quack(){
        System.out.print("- cannot quack");
    }

    public void fly(){
        System.out.print(", cannot fly");
    }

    public void eat(){
        System.out.print(", cannot eat");
    }

    public void swim(){
        System.out.print(", can swim\n");
    }
}
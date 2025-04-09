package Ducks;

abstract class Duck implements InterDuck{

    private String name;
    private String color;
    private int age;

    String getName(){return name;}
    String getColor(){return color;}
    int getAge(){return age;}

    void setName(String name){this.name = name;}
    void setColor(String color){this.color = color;}
    void setAge(int age){this.age = age;}

    public void display(){
        System.out.println("Duck Information");
        System.out.println("- Name: "+getName()+" | - Color: "+getColor()+" | - Age: "+getAge());
        duckType(); quack(); fly(); eat(); swim();
    }

    public void duckType(){
        System.out.println("This is a normal duck.");
    }

    public void quack(){
        System.out.print("Duck can Quack");
    }

    public void fly(){
        System.out.print("Duck can Fly");
    }

    public void eat(){
        System.out.print("Duck can Eat");
    }

    public abstract void swim();
}

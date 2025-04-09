package FreshCoffee_Practice;

public class AbstractDemoCal {

    public static void main(String[]args){
        Circle cr = new Circle(10.5);
        cr.area();
        cr.display();

        Square sq = new Square(2);
        sq.area();
        sq.display();

        Rect rect = new Rect(3,4);
        rect.cal();
        rect.display();
    }
}

abstract class Shape{
//    abstract void area();
    void display(){
        System.out.println("I am a shape\n");
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
//    @Override
    void area(){
        double result = Math.PI*Math.pow(radius,2);
        System.out.println(result);
    }
}

class Square extends Shape{
    double length;
    Square(double length){
        this.length=length;
    }
//    @Override
    void area(){
        double result = length*length;
        System.out.println(result);
    }
}

class Rect extends Shape{
    int length,breath;
    Rect(int length,int breath){
        this.length=length; this.breath=breath;
    }
//    @Override
//    void area(){
//
//    }
    void cal(){
        System.out.println(length*breath);
    }
}
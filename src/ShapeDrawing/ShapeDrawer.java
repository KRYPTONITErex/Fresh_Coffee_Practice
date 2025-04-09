package ShapeDrawing;

public class ShapeDrawer {

    public static void main(String[]args){

        AbstractShape shapeC = new Circle(5.5);
        AbstractShape shapeR = new Rectangle(4, (int) 3.5);
        AbstractShape shapeT = new Triangle();


        shapeC.draw();
//        System.out.println(((Circle) shapeC).calculateArea(5.0));
//        System.out.println(((Circle) shapeC).calculateArea());
        System.out.println(shapeC);
        System.out.println(" ");

        shapeR.draw();
//        System.out.println(((Rectangle) shapeR).calculateArea());
        System.out.println(shapeR);
        System.out.println(" ");

        shapeT.draw();

    }
}

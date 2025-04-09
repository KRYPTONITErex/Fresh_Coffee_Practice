package ShapeDrawing;

class Circle extends AbstractShape {
    private double radius;
    public Circle(double r) {
        this.radius = r;
    }
    @Override
    public void draw() {
        System.out.println("Draw a Circle with Radius");
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public String toString() {
        return "Circle Area: " + calculateArea();
    }
}

class Rectangle extends AbstractShape {
    private int Length;
    private int Breadth;

    public Rectangle(int L, int B) {
        this.Length = L;
        this.Breadth = B;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }

    @Override
    public double calculateArea() {
        return Length * Breadth;
    }

    public String toString() {
        return "Rectangle Area: " + calculateArea();
    }
}

class Triangle extends AbstractShape{

    @Override
    public void draw() {
        System.out.println("Draw A triangle but not need to calculate area");
    }

    //no need triangle area
//    @Override
//    double calculateArea() {
//        return 0;
//    }
}

package FreshCoffee_Practice2;
//OPEN/CLOSED PRINCIPLE;
public class InterfaceAreaDe {
    public static void main(String []args){

        Square sq = new Square();
        sq.area(2,3);

        Circle cr = new Circle();
        cr.area(2.5,1);
    }
}

interface IAreaCal{
    double area(double a, double b);
}

class Square implements IAreaCal{

    public double area(double a, double b){
        double res = a * b;
        System.out.println(res);
        return res;
    }
}
class Circle implements IAreaCal{

    public double area(double radius,double unused){
        double res = Math.PI * Math.pow(radius,2);
        System.out.println(res);
        return res;
    }
}


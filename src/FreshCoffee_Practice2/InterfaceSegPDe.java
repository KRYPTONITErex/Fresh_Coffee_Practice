package FreshCoffee_Practice2;

public class InterfaceSegPDe {

    public static void main(String[]args){

        AreaCal calA = new AreaCal();
        System.out.println(calA.calArea(2.5,3.5));

        VolCal calV = new VolCal();
        System.out.println((int)calV.calVol(2,3,4.5));
    }
}

interface IShapeAreaCalculator{
    double calArea(double x, double y);
}
interface IShapeVolCalculator{
    double calVol(double x, double y, double z);
}

class AreaCal implements IShapeAreaCalculator{
    public double calArea(double x, double y){
        double res = x * y;
        return res;
    }
}

class VolCal implements IShapeVolCalculator{
    public double calVol(double x, double y, double z){
        double res = x*y*z;
        return res;
    }
}



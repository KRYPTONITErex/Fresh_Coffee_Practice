package FreshCoffee_Practice2;

public class JavaInterfaceDe {

    public static void main(String[]args){

        smartPhone sP = new smartPhone();
        sP.call(); sP.takePhoto(); sP.takeVideo();
        System.out.print(" and ");
        sP.usingInternet();
    }
}

interface Phone{
    void call();
    void usingInternet();
}

interface Camera{
    public void takePhoto();
    public void takeVideo();
}

class smartPhone implements Phone,Camera{
    public void call(){
        System.out.println("SmartPhone can make phone calls,");
    }
    public void usingInternet(){
        System.out.print("using internet");
    }
    public void takePhoto(){
        System.out.print("taking photo,");
    }
    public void takeVideo(){
        System.out.print("taking video");
    }
}
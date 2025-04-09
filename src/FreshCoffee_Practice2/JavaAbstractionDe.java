package FreshCoffee_Practice2;

public class JavaAbstractionDe {

    public static void main(String[]args){

        evSpec ev1 = new evSpec();
        ev1.setmainCompany("Changan");
        ev1.setModelName("Deepal S7");

        ev1.autoDriving(ev1.getmainCompany(), ev1.getModelName());

        evSpec ev2 = new evSpec();
        ev2.setmainCompany("Tesla");
        ev2.setModelName("Model Y");

        ev2.autoDriving(ev2.getmainCompany(),ev2.getModelName());

    }
}

abstract class evCars{
    abstract void autoDriving(String modelName, String mainComapny);
}

class evSpec extends evCars{
    private String mainCompany;
    private String modelName;
    @Override
    void autoDriving(String mainCompany, String modelName) {
        System.out.println("");
        System.out.println(modelName+" manufactured by Changan Co.,ltd "+mainCompany+" has partially auto driving features");
    }

    String getmainCompany(){return mainCompany;}
    String getModelName(){return modelName;}

    void setmainCompany(String mainCompany){this.mainCompany=mainCompany;}
    void setModelName(String modelName){this.modelName=modelName;}
}

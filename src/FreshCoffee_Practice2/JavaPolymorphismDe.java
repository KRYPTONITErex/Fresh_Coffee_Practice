package FreshCoffee_Practice2;

public class JavaPolymorphismDe {
    public static void main(String[]args){

        Engineers eng = new Engineers();
        eng.learnMath();
        mechanicalEngr mechEngr = new mechanicalEngr();
        mechEngr.learnMath();
        civilEngr civEngr = new civilEngr();
        civEngr.learnMath();

        TerroristShooters tsr = new TerroristShooters();
        tsr.GunTypes("AK 47");
        tsr.shot();

        CounterTerroristShooters ctsr = new CounterTerroristShooters();
        ctsr.GunTypes("M4");
        ctsr.shot();
    }
}
//same method different operations
class Engineers{
    void learnMath(){
        System.out.println("Every engineer need to know basic Maths.");
    }
}

class mechanicalEngr extends Engineers{
    void learnMath(){
        System.out.println("Mechanical Engineer also need to learn Maths as Basic");
    }
}

class civilEngr extends Engineers{
    void learnMath(){
        System.out.println("Civil Engineer also need to learn Maths as Basic");
    }
}

interface Shooters{
    public void shot();
    public void GunTypes(String name);
}
class TerroristShooters implements Shooters{
    public void shot(){
        System.out.println("Terrorist use gun to rob and attack civilians");
    }
    public void GunTypes(String name){
        System.out.println("\nTerrorist use "+name+" guns");
    }
}
class CounterTerroristShooters implements Shooters{
    public void shot(){
        System.out.println("Counter Terrorist use gun to Protect civilians");
    }
    public void GunTypes(String name){
        System.out.println("\nCounter Terrorist use "+name+" guns");
    }
}

package FreshCoffee_Practice2;
//Liskov Sub Principle
public class AbstractLSPDe {

    public static void main(String[]args){
        FLYB flyB = new FLYB();
        flyB.flyHigh("Eagle");
        flyB.flyHigh("Hwak");
        flyB.flyLow("Small Birds",5);
        flyB.hunter();

        Ostrich ost = new Ostrich();
        ost.runner();

        Duck duc = new Duck();
        duc.flyHigh("Super Fiction");
        duc.flyLow("Normal", 10);
        duc.hunter();
        duc.runner();

    }
}

interface FlyingBird{
    abstract void flyHigh(String name);
    abstract void flyLow(String name, int size);
    abstract void hunter();
}
interface NonFlyingBird{
    abstract void runner();
}

class FLYB implements FlyingBird{
    public void flyHigh(String name){
        System.out.println(name + " can fly so HIGH.");
    }
    public void flyLow(String name, int size){
        System.out.println(name+" with size lower than "+size+" inches are fly LOW.");
    }
    public void hunter(){
        System.out.println("They are good @Hunting as flying\n");
    }
}

class Ostrich implements NonFlyingBird{
    public void runner(){
        System.out.println("Ostrich can run so Fast.");
    }
}

class Duck implements FlyingBird, NonFlyingBird {
    public void flyHigh(String name){
        System.out.println(name + " can fly super High.");
    }
    public void flyLow(String name, int size){
        System.out.println(name+"with the size of more than "+ size +" inches are able to fly normal or low high");
    }
    public void hunter(){
        System.out.println("Duck hunt insects.");
    }
    public void runner(){
        System.out.println("Duck can fun , but not too fast.");
    }
}
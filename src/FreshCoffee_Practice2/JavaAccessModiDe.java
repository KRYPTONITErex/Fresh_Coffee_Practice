package FreshCoffee_Practice2;

public class JavaAccessModiDe {
    int x = 10;
    static final double PI = 3.14;

    public static void main(String []args){

        JavaAccessModiDe jam = new JavaAccessModiDe();
        System.out.println(jam.x);
        System.out.println(jam.PI);

        jam.x=20;
//        jam.PI=15;
        System.out.println(jam.x);

        smallLaptops smlpt = new smallLaptops();
        smlpt.smlptname("Dell, Lenovo, HP, Asus, Apple, Aser");
        smlpt.calculating("Dell");

        deskTops dst = new deskTops();
        dst.calculating("Window");
    }
}

abstract class Computers{
    int displayScreen = 1;
    String brand;
    void smlptname(String name){
        this.brand=name;
        System.out.println("Computer Brands are : " + brand);
    }
    abstract void calculating(String name);
    void playingVideo(){
        System.out.println("All computers can play videos");
    };
}
class smallLaptops extends Computers{
    void calculating(String name){
        System.out.println("\nsmallLaptop have "+displayScreen+" screen");
        System.out.println(name+" can calculate very fast and portable\n");
    }
}
class deskTops extends Computers{
    void calculating(String name){
        super.playingVideo();
        System.out.println(name+" can calculate but not portable ");
    }
}



/*
- for Classes
public - accessible by any other class
default - class in the same package only

- for Attributes
public - accessible for all classes
private - only access within the declared class
default - only in the same package
protected - only in the same package and subclasses

-Non-Access Modifier
final - can't inherit by other classes
abstract - can't create objects, to access -> must inherit from another class

--for Attributes & Method
final - attributes and method cannot override/modified
static - A & M belong to the class, rather than an object
abstract - can use only in abstract class, not have body, instruct to child classes

transient - A & M are skipped when serializing obj containing
synchronized - Methods can only access by one thread at a time
volatile - value of an attribute is not cached-thread-locally, always read from main-memory
*/


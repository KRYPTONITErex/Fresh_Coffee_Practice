package mypack;

public class MyPackageClass {

    public static void main(String[] args) {

        System.out.println("This is my package!");

    }

    public void display() {
        LwinPhyo lp = new LwinPhyo();
        lp.display();
    }
}

class LwinPhyo{
    public void display(){
        System.out.println("I am Lwin Phyo");
    }
}

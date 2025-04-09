package FreshCoffee_Practice;

public class ifElseDemo {

    public static void main(String [] args){

        ifElseDemo ifD = new ifElseDemo();
        ifD.checkAge(30);
        ifD.checkAge(15);
        ifD.checkAge(65);

//        checkVIP vip = new checkVIP();
//        vip.checkName("Phyo");
//        vip.checkName("Lwin");

        checkVIP.checkName("Lwin");
        checkVIP.checkName("Phyo");

    }

    void checkAge(int age){
        if (age<18) {
            System.out.println("Access Denied - you are too young");
        }else if (age>60) {
            System.out.println("Access Denied - you are too Old");
        }else {
            System.out.println(" Good to go for hiking ! ");
        }
    }
}

class checkVIP{
     public static void checkName(String name){
        if(name != "Lwin"){
            System.out.println("\nSorry you are not in list");
        }else {
            System.out.println("\nYou are welcome from Home !!");
        }
    }
}

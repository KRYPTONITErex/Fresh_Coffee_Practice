package FreshCoffee_Practice2;

public class CompostitionDeveloper {

    public static void main(String[]args){

        JuniorSE jse = new JuniorSE("Lwin",25,"16 GB",15);
        jse.working();

        System.out.println();

        JuniorSE jse2 = new JuniorSE("Moe", 23, "8 GB", 13);
        jse2.gaming();

    }
}

class MacBook{
    String ram;
    int screenSize;

    void MacBook(String ram, int screenSize){
        this.ram = ram;
        this.screenSize = screenSize;
    }

    void canCode(String ram, int screenSize){
        System.out.printf("With MacBook, %s & %d inches, can code fast...\n",ram,screenSize);
    }

    void paylingGame(String ram, int screenSize){
        System.out.printf("With MacBook, %s & %d inches, can play games...\n",ram,screenSize);
    }
}

class JuniorSE{
    private String JSEname;
    private int JSEage;
    private String ram;
    private int screensize;

    public JuniorSE(String JSEname, int JSEage, String ram, int screensize){
        this.JSEname = JSEname;
        this.JSEage = JSEage;
        this.ram = ram;
        this.screensize = screensize;
    }

    MacBook mac = new MacBook();

    void working(){
        mac.canCode(ram, screensize);
        System.out.println(JSEname+" , with age of "+JSEage+" is using for studying and working...");
    }

    void gaming(){
        mac.paylingGame(ram, screensize);
        System.out.println(JSEname+", with age of "+JSEage+" is using for gaming...");
    }
}

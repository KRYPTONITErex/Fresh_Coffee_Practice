package JavaHowTO;

public class htLoopThroughEnum {

    public static void main(String[]args){

        for(LaptopNames lpt : LaptopNames.values()){
            System.out.println(lpt);
        }

        System.out.println();
        LaptopNames lptt = LaptopNames.Acer;
        System.out.println(lptt);

    }
}

enum LaptopNames {
    Macbook, Dell, Lenovo, HP, Asus, Acer
}

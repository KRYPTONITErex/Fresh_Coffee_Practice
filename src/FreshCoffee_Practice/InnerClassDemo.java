package FreshCoffee_Practice;

public class InnerClassDemo {
    public static void main(String [] args){

        OuterClass oc = new OuterClass();
        OuterClass.innerClass ic = oc.new innerClass();
        System.out.println(ic.y + oc.x);

//        OuterClass.innerClassZ icZ = oc.new innerClassZ();
//        System.out.println(icZ.z);

        OuterClass.innerClassLP OILP = new OuterClass.innerClassLP();
        System.out.println(OILP.name);

    }
}

class OuterClass {
    int x = 10;

    class innerClass {
        int y = 5;
    }

    private class innerClassZ {
        int z = 7;
    }

    static class innerClassLP {
        String name = "LWIN";
    }

}

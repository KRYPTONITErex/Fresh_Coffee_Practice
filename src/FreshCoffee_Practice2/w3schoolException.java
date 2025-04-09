package FreshCoffee_Practice2;

public class w3schoolException {

    public static void main(String[]args) {

//        try{
//            int[] myNumbers = {1,2,3};
//            System.out.println(myNumbers[3]);
//
//        }catch (Exception e){
//            System.out.println("Something went wrong");
//            e.printStackTrace();
//        }

        try {
            findNumber();
            System.out.println("It is Exists...");
        } catch (Exception e) {
            System.out.println("not in there ! " + e.getMessage());
        }finally {
            System.out.println("Keep out as Finally !!");
        }
        System.out.println("Keep going whatever !!");
    }

    public static void findNumber() throws RuntimeException {

        int[] myNumbers = {1,2,3};
        System.out.println(myNumbers[2]);
        System.out.println("Found it !! ");
    }
}

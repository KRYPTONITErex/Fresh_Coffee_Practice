package FreshCoffee_Practice;

public class diceYatzyDemo {
    public static void main(String[]args){

        int dice = 1;

        while (dice<6){
            if(dice<5){
                System.out.println("No, not yatzy!");
            }else {
                System.out.println("Yatzy!!");
            }
            dice += 1;
        }
    }
}

package FreshCoffee_Practice3GPT;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class ControlStructure2 {
    public static void main(String[]args){

        LocalDate today = LocalDate.now();
        System.out.println(today);

        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String day = dayOfWeek.getDisplayName(TextStyle.FULL,Locale.US);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("What day is Today??");
//        String day = scan.nextLine();

        switch(day){
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            default:
                System.out.println("It is Weekend");

        }
//        scan.close();
    }
}

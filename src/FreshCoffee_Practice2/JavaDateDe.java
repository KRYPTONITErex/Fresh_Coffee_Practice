package FreshCoffee_Practice2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateDe {
    public static void main(String[]args){

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println("");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before format : "+dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(dateTimeFormatter);

        System.out.println("After format : "+formattedDateTime);
    }
}

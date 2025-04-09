package FreshCoffee_Practice;
import java.time.LocalDate;
import java.time.LocalTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String[]args){

        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);

        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println("\nBefore Formating : " + myObj3);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        String formattedDate = myObj3.format(myFormatObj);
        System.out.println("After Formating : " + formattedDate);
    }
}



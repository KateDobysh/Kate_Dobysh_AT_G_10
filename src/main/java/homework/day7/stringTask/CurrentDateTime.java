package homework.day7.stringTask;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CurrentDateTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH 'hours' mm 'minutes'");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
    }
}
package homework.day6.stringTask;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args){
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String dateTimeString = now.format(formatter);
        System.out.println(dateTimeString);

    }
}

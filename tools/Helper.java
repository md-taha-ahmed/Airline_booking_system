package tools;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Helper {
    public static int getId() {
        Random random = new Random();
        return random.nextInt(Integer.SIZE - 1);
    }

    public final static Scanner scan = new Scanner(System.in);

    public static LocalDateTime StringToDateFormatter(String input) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime date = LocalDateTime.parse(input, format);
        return date;
    }

    public static String dateToStringFormatter(LocalDateTime input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH':'mm");
        String date = input.format(formatter);
        return date;
    }

}

package javaEightFeatures;

import java.time.LocalTime;

public class LocalTime_01 {
    static void main() {
        LocalTime CurrentTime  = LocalTime.now();
        System.out.println(CurrentTime);
        // we can Create Our Custom time
        LocalTime localTime = LocalTime.of(4, 54, 56, 454);
        System.out.println(localTime);

        // if you have already a time in String so you can Parse into time using parse() method
        String timeString = "15:30:45";
        LocalTime parsedTime = LocalTime.parse(timeString);
        System.out.println(parsedTime);

        // we can also do operation with time
        CurrentTime.minusHours(14);
        CurrentTime.minusMinutes(14);
        CurrentTime.minusSeconds(14);

        if (CurrentTime.isAfter(localTime)){
            System.out.println("Han Bhai");
        }



    }
}

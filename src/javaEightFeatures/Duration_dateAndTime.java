package javaEightFeatures;
//Duration: Represents the amount of time between two time-based values, measured in hours,
//minutes, seconds, and nanoseconds.
// We are using Duration with Second Hour Minutes But it's not Work with Date Months day
//we are Using Period for Working with date days Months etc

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Duration_dateAndTime {
    static void main() {
        Instant start = Instant.now();
        Instant end = Instant.now();
        Duration d1 = Duration.between(start, end);
        System.out.println(d1);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d2);

    }


    }


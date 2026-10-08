package javaEightFeatures;
//Period: Represents the amount of time between two date-based values, measured in years, months, and days.
// so when we have to work with Date day months Year then we are Using Period


import java.time.LocalDate;
import java.time.Period;

public class Period_Date_Time {
    static void main() {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1990, 2, 2);
        Period period = Period.between(now, then);
        System.out.println(period);
//        period. -> we can use all the listed methods and work with period minus days months get days or many methods are listed there



    }
}

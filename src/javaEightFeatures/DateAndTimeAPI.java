package javaEightFeatures;
// in old java there is 2 classes called Date and Calender but there is some Limition in that classes to Overcome it java8 Provided new Date and time classes
// Issues With Legacy Date and Calendar Classes
// Mutable-> so legecy Date Classes are Mutable so Its's Chances of Inconsistancy and thread safety then the Bugs chances are low and always we have to make sure it's may changes anywhare
// Confusing -> Legacy date Classes are More confusing because of it's Incosistancy nature
//Limited Functionality Provided
// so these are the Major issues and Limitation with the Data and calender classes

// so Java 8 Introduced here and overcome the Legecy date and calendar class
// Java (8) Provide us 8 classes For Date and Time
// so these are the Classes Java Provide to work with
//1. Local Date  -> Represent a Date WithOut a time zone
// 2. local time  -> Represent a time Without a date or time zone
// 3.local datetime -> Represent a date and time without a time zone
// 4.zoned date time -> Represent a date and time with a time Zone
// 5. instant -> Represent an Instantaneous point on the timeline, typically used for machine timestamps
// 6.period -> Represent a period time between two dates
// 7.duration -> Represent a duration of time between two Points in time
// 8.date time Formatter -> froments and pharase dates and times


import java.time.LocalDate;

public class DateAndTimeAPI {
    static void main() {
        LocalDate now = LocalDate.now();// now is a method its used to show Currunt things
        System.out.println(now);
        // we can create our Custom Local Date \
        LocalDate myDate = LocalDate.of(2005,9,25); //of() method is used to create value or object of list or anything
        // Operations On Local date
        int dayOfMonth = now.getDayOfMonth();
        int monthValue = now.getMonthValue();
        int year = now.getYear();
        System.out.println(dayOfMonth);
        System.out.println(monthValue);
        System.out.println(year);
        // so for Local date we are use now() to take Current Date
        // using of to Create custom dates
        // using get to Get day month year of Date
        // using minus() function you can minus Date days months years
        now.minusDays(4);
        now.minusMonths(4);
        now.minusYears(12);

        if(now.isAfter(myDate)){
            System.out.println("OOPS");
        }
    }



}

package javaEightFeatures;
//DateTimeFormatter: A Java class used to format and parse date/time values into a specific pattern, such as dd-MM-yyyy HH:mm:ss.


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_01 {
    static void main() {
    LocalDate localdate = LocalDate.parse("2026-10-08");//-> this going to be Compiled Because its is in a Proper Format
        System.out.println(localdate);
//    LocalDate localdate1 = LocalDate.parse("08-10-2026") ;
//       System.out.println(localdate1);//-> it's through a Exception Beacuse it's not in a Proper Formet

     // Date Formater Introduced here to solve this Problem
    String data ="25/04/1998";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(data, dateTimeFormatter);
        System.out.println(parse);



    }
}

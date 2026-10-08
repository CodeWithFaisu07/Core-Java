package javaEightFeatures;
//LocalDateTime: Represents both date and time without time-zone information
// LocalDateTime is Combination of Local date and Local Time so we can use all the Method and Operation we are actually using In Local time and Local date

import java.time.LocalDateTime;

public class Local_Date_Time {
    static void main() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

//        // we can also creates custom Datetime
//        LocalDateTime localDateTime = LocalDateTime.of(, 10);

        LocalDateTime parse = LocalDateTime.parse("2020-10-08T13:24:42.908307200");
        System.out.println(parse);



    }
}

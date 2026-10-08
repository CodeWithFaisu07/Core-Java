package javaEightFeatures;

import java.time.Instant;
import java.time.ZoneId;

// curruntTimeMillis is a legacy class of java we are using it to cheack how much time passed Since 1st january 1970 at 12:00 pm;
// so java 8 provide instant for do this same Work
//let's Understand Into code
public class Instant_DateTime {
    static void main() {
        long l = System.currentTimeMillis();//-> its shows How Much time passed Since 1 January 1970
        System.out.println(l);
        Instant now = Instant.now();//-> its same as currentTimeMillis() but along with its print the current date time
        System.out.println(now);

//        now.atZone(ZoneId())
    }
}

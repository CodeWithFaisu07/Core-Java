package javaEightFeatures;
// UTC -> Universal Time Cordinator -> so this is a World wide clock all the Zones(diffrent diffrent palace have thier diffrent time according to day or nights that's called Zones, and there are 24 Standred zones and its work around UTC )are Work Around that UTC Diffrent Zones may have Diffrent Times But there UTC will always be same and the zones times Works around UTC

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

// so we are already Know about Local time and Local Date and Local Date Time
// so they are use Only System clock (it's mean What time Date are on your laptop )
//but if You want to used Zoned Time(Real time According to UTC )
//ZonedDateTime: Represents a date and time along with the time-zone information.
public class Zoned_dateTime {
    static void main() {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        // print all availabilityZones
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);

        // we can also Create custom ZonedDateTime
        ZonedDateTime customZonedDT = ZonedDateTime.of(2000, 12, 1, 14, 30, 30, 300, ZoneId.of("America/Cuiaba"));
        System.out.println(customZonedDT);

        // now Cheaking what is the the CurrentDate time of India and America
        ZonedDateTime IndiaTime = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        System.out.println("Currunt Time In India : -"+ IndiaTime);
        ZonedDateTime AustraliaTime = ZonedDateTime.now(ZoneId.of("Australia/Queensland"));
        System.out.println("Currunt Time In Australia: -"+ AustraliaTime);


        // we can use all the Operations we are already used in ZoneDateTime
    }
}

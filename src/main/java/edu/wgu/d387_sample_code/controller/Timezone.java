package edu.wgu.d387_sample_code.controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
@CrossOrigin(origins = "http://localhost:4200")
public class Timezone {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    public static String convertTime() {
        String meetingTime = "2023-10-11T12:30:00Z";
        ZonedDateTime meetingZonedDateTime = ZonedDateTime.parse(meetingTime);

        ZoneId etZone = ZoneId.of("America/New_York");
        ZoneId mtZone = ZoneId.of("America/Denver");
        ZoneId utcZone = ZoneId.of("UTC");

        ZonedDateTime etTime = meetingZonedDateTime.withZoneSameInstant(etZone);
        ZonedDateTime mtTime = meetingZonedDateTime.withZoneSameInstant(mtZone);
        ZonedDateTime utcTime = meetingZonedDateTime.withZoneSameInstant(utcZone);

        String etTimeString = etTime.format(dateTimeFormatter);
        String mtTimeString = mtTime.format(dateTimeFormatter);
        String utcTimeString = utcTime.format(dateTimeFormatter);

        return etTimeString + " ET, " +  mtTimeString + " MT, "  + utcTimeString + " UTC";
    }

}

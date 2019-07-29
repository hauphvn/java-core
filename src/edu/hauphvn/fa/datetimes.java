package edu.hauphvn.fa;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class datetimes {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(localDate.format(dateTimeFormatter));
        System.out.println(localDate.getYear());
        String myDate = "20-12-2019";
        System.out.println(LocalDate.parse(myDate, dateTimeFormatter));
        LocalTime localTime = LocalTime.now();
        System.out.println();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        Period period = Period.ofDays(5);
        System.out.println(localDate.plus(period).format(dateTimeFormatter));

        Duration duration = Duration.ofHours(5);
        System.out.println();
        System.out.println(localTime.plus(duration));

        ZoneId zoneId  = ZoneId.of("Asia/Ho_Chi_Minh");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);
    }
}

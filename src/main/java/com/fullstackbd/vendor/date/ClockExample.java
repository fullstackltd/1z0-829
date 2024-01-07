package com.fullstackbd.vendor.date;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ClockExample {
    public static void main(String[] args) {
        // Obtain the current instant in the default time zone
        Clock defaultClock = Clock.systemDefaultZone();
        Instant defaultInstant = defaultClock.instant();
        ZonedDateTime defaultZonedDateTime = ZonedDateTime.ofInstant(defaultInstant, ZoneId.systemDefault());

        // Obtain the current instant in UTC
        Clock utcClock = Clock.systemUTC();
        Instant utcInstant = utcClock.instant();
        ZonedDateTime utcZonedDateTime = ZonedDateTime.ofInstant(utcInstant, ZoneId.of("UTC"));

        // Obtain the current instant in a specific time zone
        Clock zoneClock = Clock.system(ZoneId.of("America/New_York"));
        Instant zoneInstant = zoneClock.instant();
        ZonedDateTime zoneZonedDateTime = ZonedDateTime.ofInstant(zoneInstant, ZoneId.of("America/New_York"));

        // Display the current time using different clocks
        displayTime("Default Time Zone", defaultZonedDateTime);
        displayTime("UTC", utcZonedDateTime);
        displayTime("Custom Time Zone (America/New_York)", zoneZonedDateTime);
    }

    private static void displayTime(String label, ZonedDateTime zonedDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println(label + ": " + zonedDateTime.format(formatter));
    }
}

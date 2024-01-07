package com.fullstackbd.vendor;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        // Obtain the current instant in the default time zone
        Clock defaultClock = Clock.systemDefaultZone();
        Instant defaultInstant = defaultClock.instant();
        System.out.println("Default Zone: " + defaultInstant);

        // Obtain the current instant in UTC
        Clock utcClock = Clock.systemUTC();
        Instant utcInstant = utcClock.instant();
        System.out.println("UTC: " + utcInstant);

        // Obtain the current instant in a specific time zone
        Clock zoneClock = Clock.system(ZoneId.of("America/New_York"));
        Instant zoneInstant = zoneClock.instant();
        System.out.println("Time Zone: " + zoneInstant);
    }
}
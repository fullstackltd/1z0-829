package com.fullstackbd.vendor.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDeyDemo {
  public static void main(String[] args) {
    
    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt.format(DateTimeFormatter.ofPattern("hh:mm a")));
    // LocalDate ld = LocalDate.of(1970, 7, 28);
    // ValueRange vr = ld.range(ChronoField.YEAR_OF_ERA);
    // System.out.println(vr.getMinimum());
    // System.out.println(vr.getMaximum());
    // System.out.println(vr.getLargestMinimum());
    // System.out.println(vr.getSmallestMaximum());
  }
}

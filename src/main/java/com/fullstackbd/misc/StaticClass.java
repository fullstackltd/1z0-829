package com.fullstackbd.misc;

public class StaticClass {
  static int x;
  int y;

  static {
    x = 42;
    System.out.println("Static block: " + (x));
  }
}

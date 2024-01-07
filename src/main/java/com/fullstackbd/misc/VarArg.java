package com.fullstackbd.misc;

public class VarArg {
  
  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4, 5));
    // System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
    // System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
  }

  public static int sum(Integer... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}

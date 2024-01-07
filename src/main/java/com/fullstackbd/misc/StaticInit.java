package com.fullstackbd.misc;

public class StaticInit {
    int x;
    static int y;

    static {
        y = 42;
        System.out.println("Static block: "+(y));
    }

    public StaticInit(int x) {
        this.x = x;
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        StaticInit si = new StaticInit(42);
        System.out.println(si.x);
        System.out.println(StaticInit.y);
        StaticInit s = new StaticInit(52);
        System.out.println(s.x);
        System.out.println(StaticInit.y);
    }
}

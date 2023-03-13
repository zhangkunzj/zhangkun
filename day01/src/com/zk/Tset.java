package com.zk;

public class Tset {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        x = x ^ y;
        System.out.println(x);
        y = x ^ y;
        System.out.println(y);
        x = x ^ y;
        System.out.println(x);
    }
}

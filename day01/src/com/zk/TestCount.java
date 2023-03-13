package com.zk;

public class TestCount {
    public static void main(String[] args) {
        new Teacher();
        new Teacher();
        new Teacher();
        new Teacher();
        new Teacher();
        new Teacher(1);
        Teacher.showCount();
    }
}

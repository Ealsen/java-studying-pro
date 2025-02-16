package com.test.entity;

public class TestClassDemo1 {
    int testNum = 10;
    
    // static block
    static {
        System.out.println("TestClassDemo1 static block");
    }
    // default constructor
    public TestClassDemo1() {
    }

    // parameterized constructor
    public TestClassDemo1(String str) {
        System.out.println("TestClassDemo1()" + str);
    }

    public int getTestNum() {
        return testNum;
    }

    public void setTestNum(int testNum) {
        this.testNum = testNum;
    }

    public static void printHelloString1() {
        System.out.println("TestClassDemo1 printHelloString1");
    }
}
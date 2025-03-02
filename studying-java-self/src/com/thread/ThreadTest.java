package com.thread;

public class ThreadTest {
    public static void threadTest1() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1!");
            }
        });
        t1.start();
        System.out.println("Main!");
    }
}

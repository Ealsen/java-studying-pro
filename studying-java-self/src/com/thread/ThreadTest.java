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
    public static void threadTest2() {
        Thread t2 = new Thread(()->{
            System.out.println("t2!");
        });
        t2.start();
        System.out.println("Main!");
    }
}
/*
线程
https://www.itbaima.cn/document/lfqtvxr7azumcwja
 */
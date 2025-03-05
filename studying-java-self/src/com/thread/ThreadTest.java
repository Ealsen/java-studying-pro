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
后面的章节懒得敲代码了，这里附上在线笔记链接
 */

/*
线程
https://www.itbaima.cn/document/lfqtvxr7azumcwja
 */

/*
反射
https://www.itbaima.cn/document/lfqtvxr7azumcwja?segment=2#doc8-%E5%8F%8D%E5%B0%84
 */

/*
注解
https://www.itbaima.cn/document/lfqtvxr7azumcwja?segment=3#doc8-%E9%A2%84%E8%AE%BE%E6%B3%A8%E8%A7%A3
 */
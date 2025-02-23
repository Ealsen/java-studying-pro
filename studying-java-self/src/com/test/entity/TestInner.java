package com.test.entity;

public class TestInner {
    static {
        System.out.println("outer static");
    }
    public int num;
    TestInner() {

    }
    TestInner(int num) {
        this.num = num;
    }

    public void printNum() {
        System.out.println(num);
    }

    class Inner {
        // static { // update jdk to 16
        //     System.out.println("inner static");
        // }
        public int num_inner;
        Inner() {

        }
        Inner(int num_inner) {
            this.num_inner = num_inner;
        }
        public void printNum() {
            System.out.println(num);
            System.out.println(num_inner);
        }
    }
}

package com.entity;

/**
 * @author Ealsen
 * @date 2025-02-05
 * @ddescription Worker
 */

public class Worker extends Person implements working {

    public Worker() {}

    public Worker(String name, int age, String gender) {
        super("Unknown", 0, "Unknown"); // call the parent constructor
    }

    public void working() {
        System.out.println("Worker is working");
    }

    // @Override
    // public void examTest() {
    //     System.out.println("Worker is taking an exam");
    // }
}

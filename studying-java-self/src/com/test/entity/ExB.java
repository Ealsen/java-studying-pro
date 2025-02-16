package com.test.entity;

public class ExB implements ExA { // implements ExA interface
    @Override
    public void methodA() {
        System.out.println("Method A of ExB");
    }
}

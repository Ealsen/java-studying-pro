package com.entity;

public class Student extends Person implements Study, Play {
    String name;
    private Status status;

    public Student() {}

    public Student(String name, int age, String gender) {
        super(name, age, gender); // call the constructor of the parent class
    }

    public void study() {
        System.out.println("Student studying.");
    }
    public void play() {
        System.out.println("Student playing.");
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // @Override
    // public void examTest() {
    //     System.out.println("Student taking exam.");
    // }

//    void printSelfClassName() {
//        System.out.println("Student class name: " + this.name);
//    }
//
//    public void printFatherClassName() {
//        System.out.println("Father class name: " + super.getName());
//    }
}

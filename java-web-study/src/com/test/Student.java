package com.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;

    @Override
    public String toString() {
        System.out.println("id:"+id+",name:"+name+",\ngender:"+gender+",age:"+age);
        return "Done.";
    }
}

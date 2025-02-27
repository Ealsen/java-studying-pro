package com.test.entity;

// 泛型
public class Score<U,V,T> {
    U name;
    V id;
    T value;

    public Score() {
    }

    public Score(U name, V id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }
    public U getName() {
        return name;
    }
    public void setName(U name) {
        this.name = name;
    }
    public V getId() {
        return id;
    }
    public void setId(V id) {
        this.id = id;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}


// public class Score {
//     String name;
//     String id;
//     Object value;  //因为Object是所有类型的父类，因此既可以存放Integer也能存放String
//
//     public Score() {
//     }
//
//     public Score(String name, String id, Object value) {
//         this.name = name;
//         this.id = id;
//         this.value = value;
//     }
// }
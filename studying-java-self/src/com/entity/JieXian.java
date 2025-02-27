package com.entity;

// 泛型的界限
public class JieXian<W,T extends Object> {
    // extends 上限 And super Object 下限 super 只有 ? 能用
    // 如 <? super Number>
    W name;
    T age;
    W message;

    public JieXian() {
    }

    public JieXian(W name, T age, W message) {
        this.name = name;
        this.age = age;
        this.message = name;
    }

    public W getName() {
        return name;
    }
    public void setName(W name) {
        this.name = name;
    }
    public T getAge() {
        return age;
    }
    public void setAge(T age) {
        this.age = age;
    }
    public W getMessage() {
        return message;
    }
    public void setMessage(W message) {
        this.message = message;
    }
}

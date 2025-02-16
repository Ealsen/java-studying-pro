package com.test.entity;

public class StdCl extends Student implements study,play,Cloneable {
    public StdCl() {}
    public StdCl(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {   //提升clone方法的访问权限
        return super.clone();   //因为底层是C++实现，我们直接调用父类的实现就可以了
    }

}

package com.test.jdbc;

public class StdTest {
    /*
    * 用与 JDBC 的测试类
    */
    Integer sid;
    String name;
    String gender;

    public StdTest(Integer sid, String name, String gender) {
        this.sid = sid;
        this.name = name;
        this.gender = gender;
}
    public void sayHello(){
        System.out.println("hello");
    }
    // 打印信息
    public void printInfo() {
        System.out.println("StudentID: " + sid +",Name: " + name + ",Gender: " + gender + ".");
    }
}

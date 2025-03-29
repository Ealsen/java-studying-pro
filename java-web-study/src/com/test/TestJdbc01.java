package com.test;

import java.sql.*;

public class TestJdbc01 {
    public static void main(String[] args) {
        //DriverManager是管理数据库驱动的工具类，我们可以通过它来查看当前已经引入的驱动列表
        DriverManager.drivers().forEach(System.out::println);

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/study","root","123456");
             Statement statement = connection.createStatement()){
            //使用executeQuery来执行一个查询SQL语句
            ResultSet set = statement.executeQuery("select * from students");  //选择user表全部内容
            while (set.next()){
                System.out.println(set.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

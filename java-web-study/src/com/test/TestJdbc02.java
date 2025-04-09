package com.test;

import java.sql.*;
import java.util.Scanner;

public class TestJdbc02 {
    public static <Account> void main(String[] args) {

        /*
         * PreparedStatement
         * 预编译SQL语句，减少SQL注入攻击
         */

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_test_db","root","123456");
             PreparedStatement statement = connection.prepareStatement("select * from user_test_01 where username=? and password=?")){
        Scanner scanner = new Scanner(System.in);
        statement.setString(1,scanner.next());
        statement.setString(2,scanner.next());

       /*
        * 使用 PreparedStatement SQL注入问题已经解决
        * test
        * 1111' or 1=1; --
        */

        System.out.println("\n实际上执行的SQL语句:" + statement.toString());

        ResultSet res = statement.executeQuery();
        while (res.next()){
            String username = res.getString("username");
            System.out.println("用户"+ username + "登录成功!");
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

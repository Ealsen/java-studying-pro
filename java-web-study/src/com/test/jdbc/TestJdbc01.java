package com.test.jdbc;

import java.sql.*;
// import java.util.UUID;

public class TestJdbc01 {
    public static void main(String[] args) {
        // DriverManager是管理数据库驱动的工具类，我们可以通过它来查看当前已经引入的驱动列表
        DriverManager.drivers().forEach(System.out::println);

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_test_db","root","123456");
             Statement statement = connection.createStatement()){
            System.out.println("连接成功.");

          /*
           * JDBC 事务
           */

            // connection.setAutoCommit(false); // 关闭自动提交, 默认是开启的

            // Savepoint savepoint = connection.setSavepoint();
            // // 中间写正常的 JDBC SQL 语句 比如插入删除修改等
            // connection.commit(); // 手动提交事务
            // connection.rollback(); // 回滚事务
            // connection.rollback(savepoint); // 回滚到指定点

           /*
            * JDBC SQL注入攻击
            * 这里不进行展示,
            * 大概就是通过SQL语句来
            * 实现用户无需密码或者密码错误
            * 例如 输入 1' or '1'='1
            * 依然能进行登录
            */

           /*
            * JDBC 与 Class 联动
            * 还能与反射联动,更灵活(这里不进行演示)
            */

            ResultSet set = statement.executeQuery("select * from std_test_1");
            while (set.next()){
                // 创建一个StdTest对象
                StdTest std = new StdTest(set.getInt(1), set.getString(2), set.getString(3));
                std.printInfo();
            }

            /*
             * JDBC的Statement接口，用于执行SQL语句，并且返回结果集
             * 这里是一些 常见的 JDBC SQL 语句
             */

            // // 批处理
            // statement.addBatch("insert into std_test_1(name,gender) values('你好啊','无')");
            // statement.addBatch("insert into std_test_1(name,gender) values('你好啊','无')");
            // statement.addBatch("insert into std_test_1(name,gender) values('你好啊','无')");
            // statement.executeBatch();
            // System.out.println("批处理成功");

            // // 使用executeUpdate来执行一个SQL语句
            // int countWin = statement.executeUpdate("insert into std_test_1(name,gender) values('你好啊','无')");
            // // sid是自增的主键
            // System.out.println("成功插入" + countWin + "条数据.");

            // //使用executeQuery来执行一个查询SQL语句
            // ResultSet set = statement.executeQuery("select * from std_test_1");  //选择user表全部内容
            //
            // while (set.next()){
            //     System.out.println(set.getInt(1));
            //     System.out.println(set.getString(2));
            //     System.out.println(set.getString(3));
            // }

            // while (set.next()){
            //     System.out.println(set.getString("name"));
            // }
            // while (set.next()){
            //     System.out.println(set.getString(2));
            // }            // while (set.next()){
            //             //     System.out.println(set.getString(3));
            //             // }


            // // // 下面是错误的代码
            // // 产生随机字符串uuid
            // String randomString = UUID.randomUUID().toString().replace("-","");
            // // 产生随机年龄
            // int randomAge = (int)(Math.random()*100);
            // // System.out.println(randomAge);
            // // 创造字符数组
            // char[] chars = {'张', '李', '王', '赵', '钱', '孙', '周', '吴', '郑', '王', '冯', '陈', '褚', '卫', '蒋', '沈', '韩', '杨', '朱', '秦', '尤', '许', '何', '吕', '施', '张', '孔', '曹', '严', '华', '金', '魏',};
            // // 根据字符数组产生随机姓名
            // StringBuilder sb = new StringBuilder();
            // for (int i = 0; i < 2; i++) {
            //     sb.append(chars[(int)(Math.random()*chars.length)]);
            // }
            // System.out.println(sb.toString());
            // // 产生随机性别
            // String randomGender = Math.random()>0.5?"男":"女";
            // System.out.println(randomGender);

            // // 插入 端木宏 asidhuw2he21kawsodkoiw2 22
            // statement.executeUpdate("insert into students(name,id,gender,age) values('端木宏','asidhuw2he21kawsodkoiw2','男',22)");
            // System.out.println("插入成功");

            // // 插入随机数据
            // for (int i = 0; i < 100; i++) {
            //     String name = sb.toString();
            //     String id = randomString;
            //     String gender = randomGender;
            //     int age = randomAge;
            //     statement.executeUpdate("insert into students(name,id,gender,age) values('"+name+"','"+id+"','"+gender+"',"+age+")");
            // }
            // System.out.println("插入随机数据成功");

            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

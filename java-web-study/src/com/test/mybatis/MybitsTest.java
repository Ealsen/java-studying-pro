package com.test.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.IOException;

public class MybitsTest {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder()
                        .build(
                                new FileInputStream("src/com/test/mybatis/mybatis-config.xml"));

        // sqlSessionFactory.openSession(true) 自动提交事务.
        try(SqlSession session = sqlSessionFactory
                .openSession(true)){
            System.out.println("连接成功.");
            // List<Student> list = session.selectList("selectAllFstd_info_1");
            // list.forEach(System.out::println);
            Student student = session
                    .selectOne("selectOneFstd_info_2",
                            "78ae036b-b36e-6c25-f217-2e507fdc38fa");
            System.out.println(student);
        }
    }
}

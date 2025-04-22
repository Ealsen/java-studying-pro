package com.test;

import com.test.mapper.TestMapper;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

@Log
public class Main {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources
                        .getResourceAsStream("mybatis-config.xml"));
        log.info("sqlSessionFactory created");

        try (var sqlSession = sqlSessionFactory.openSession(true)) {
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
            log.info(mapper.getStudentBySid(100002).toString());
        }
    }
}

package com.test.mybatis.mapper;

import com.test.mybatis.MybatisUtil;
import com.test.mybatis.StdTest1;
import org.apache.ibatis.session.SqlSession;


// 测试Mybatis注解开发
public class TestMapperZ {
    public static void main(String[] args) {
        // // 添加数据
        // try (SqlSession sqlSession = MybatisUtil.getSession(true)){
        //     MapperZ mapper = sqlSession.getMapper(MapperZ.class);
        //     mapper.addStd(new StdTest1().setName("张三啥1").setGender("男"));
        // }
        // try (SqlSession sqlSession = MybatisUtil.getSession(true)){
        //     MapperZ mapper = sqlSession.getMapper(MapperZ.class);
        //     mapper.addStd(new StdTest1().setName("李四啥1").setGender("女"));
        // }

        // // 查询数据
        // try (SqlSession sqlSession = MybatisUtil.getSession(true)){
        //     MapperZ mapper = sqlSession.getMapper(MapperZ.class);
        //     System.out.println(mapper.selectStdBySid(100039));
        // }

        // try (SqlSession sqlSession = MybatisUtil.getSession(true)){
        //     MapperZ mapper = sqlSession.getMapper(MapperZ.class);
        //     System.out.println(mapper.selectStdBySsid(100039));
        // }

        // try (SqlSession = MybatisUtil.getSession(true)){
        //     MapperZ mapper = sqlSession.getMapper(MapperZ.class);
        //     mapper.selectStdByGender("男").forEach(System.out::println);
        // }

        System.out.println("ok");
    }
}

package com.test.mybatis;

import org.apache.ibatis.session.SqlSession;

public class MybatisUse {
    public static void main(String[] args) {
        try(SqlSession session = MybatisUtil.getSession(true)){
            System
                    .out
                    .println((Student)session
                    .selectOne("selectOneFstd_info_2",
                            "3692b437-952c-536d-2c61-fc7eb18f5b8c"));
        }
    }
}

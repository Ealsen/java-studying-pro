package com.test.mapper;

import com.test.entity.Student;
import org.apache.ibatis.annotations.Select;

public interface TestMapper {

    @Select(value = "select * from std_test_1 where sid = #{sid}")
    public Student getStudentBySid(int sid);
}

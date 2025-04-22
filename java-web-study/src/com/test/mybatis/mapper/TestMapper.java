package com.test.mybatis.mapper;

import com.test.mybatis.StdTest1;
import com.test.mybatis.Student;

import java.util.List;
// XML接口
public interface TestMapper {
    List<Student> selectAllFstd_info_1();
    Student selectOneFstdById_info_1(String id);
    int insertFstd_info_2(StdTest1 stdTest1);
    List<StdTest1> selectAllFstd_info_2();
    int deleteFstd_info_2(int sid);
    int updateFstd_info_2(StdTest1 stdTest1);
    List<StdTest1> sele1(String gender);
}

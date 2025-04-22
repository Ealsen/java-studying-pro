package com.test.mybatis.mapper;

import com.test.mybatis.StdTest1;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

// 注解方式开发接口
public interface MapperZ {
    // 注解插入数据
    @Insert("insert into std_test_1(name,gender) values(#{name},#{gender})")
    @Options(useGeneratedKeys = true, keyProperty = "sid", flushCache = Options.FlushCachePolicy.TRUE)
    int addStd(StdTest1 stdTest1);

    @Results({
            @Result(property = "sid", column = "sid"),
            @Result(property = "name", column = "name"),
            @Result(property = "gender", column = "gender")
    })
    @ConstructorArgs({  // 如果有多个构造方法，则使用@ConstructorArgs
            @Arg(column = "sid", name = "ssid", javaType = int.class),
            @Arg(column = "name", name = "sname", javaType = String.class),
            @Arg(column = "gender", name = "sgender", javaType = String.class)}
    )
    @Select("select * from std_test_1 where sid=#{ssid}")
    StdTest1 selectStdBySid(int ssid);

    @Results({
            @Result(property = "ssid", column = "sid"), // 映射字段
            @Result(property = "sname", column = "name"),
            @Result(property = "sgender", column = "gender")
    })
    @Select("select * from std_test_1 where sid=#{ssid}")
    StdTest2 selectStdBySsid(int ssid);

    @Results({
            @Result(property = "ssid", column = "sid"), // 映射字段
            @Result(property = "sname", column = "name"),
            @Result(property = "sgender", column = "gender")
    })
    @Select("select * from std_test_1 where gender=#{sgender}")
    List<StdTest2> selectStdByGender(@Param("sgender") String sgender);

}

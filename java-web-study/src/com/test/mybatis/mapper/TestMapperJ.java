package com.test.mybatis.mapper;

import com.test.mybatis.MybatisUtil;
import com.test.mybatis.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.test.mybatis.StdTest1;
public class TestMapperJ {
    public static void main(String[] args) {
        try(SqlSession session = MybatisUtil.getSession(true)){
            // MybatisUtil.getSession(true) 自动提交事务
            // 如果为false，则不提交事务，需要手动提交事务
            // session.rollback(); // 回滚事务
            // session.commit(); // 手动提交事务
            TestMapper mapper = session.getMapper(TestMapper.class);
            System.out.println(mapper.getClass());
            // mapper.selectAllFstd_info_1().forEach(System.out::println);
            // System.out.println(mapper.selectOneFstdById_info_1("2497305d-d51e-5793-87cd-3c3be21b58b9"));


            // // 随机生成名字
            // String[] names = {"张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十",
            //         "冯十一", "陈十二", "林十三", "魏十四", "蒋十五", "沈十六", "韩十七",
            //         "杨十八", "朱十九", "秦二十", "段廿一", "钱廿二", "黄廿三", "吕廿四",
            //         "施廿五", "吕廿六", "吕廿七", "吕廿八", "吕廿九", "吕三十", "吕三十一",
            //         "吕三十二", "吕三十三", "吕三十四", "吕三十五", "吕三十六", "吕三十七",
            //         "吕三十八", "吕三十九", "吕四十", "吕四十一"};
            // String gender[] = {"男", "女"};
            //
            // int result = 10;
            // for (int i = 0; i < result; i++) {
            //     String name = names[new Random().nextInt(names.length)];
            //     String genderValue = gender[new Random().nextInt(gender.length)];
            //     // 生成唯一ID
            //     String id = UUID.randomUUID().toString();
            //     StdTest1 stdTest1 = new StdTest1(name, genderValue);
            //     mapper.insertFstd_info_2(stdTest1);
            // }
            // System.out.println("成功插入" + result + "条记录.");


            // mapper.deleteFstd_info_2(100013); // 删除id为100013的记录

            // // 更新 sid 2
            // StdTest1 stdTest1 = new StdTest1();
            // stdTest1.setSid(100014).setName("李四速").setGender("男");
            // mapper.updateFstd_info_2(stdTest1);
            // System.out.println("更新成功.");

            // 动态SQL
            // List<StdTest1> list = mapper.sele1("男"); // 查询性别为男的记录
            // list.forEach(System.out::println);

            // // 缓存机制
            // Student s1 = mapper.selectOneFstdById_info_1("2497305d-d51e-5793-87cd-3c3be21b58b9");
            // Student s2 = mapper.selectOneFstdById_info_1("2497305d-d51e-5793-87cd-3c3be21b58b9");
            // // s2从缓存中取
            // System.out.println(s1 == s2); // true


        }
    }
}

package com.test.mybatis;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true) // 链式调用
public class StdTest1 {
    int sid;
    String name;
    String gender;
}

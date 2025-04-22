package com.test.mybatis;

import lombok.*;
import lombok.experimental.Accessors;

// @Setter
// @Getter
// // @NoArgsConstructor
// // @AllArgsConstructor
// @ToString
// @RequiredArgsConstructor
// @EqualsAndHashCode
@Data
@Accessors(chain = true) // 链式调用
public class Student {
    private String id;
    private String name;
    private String gender;
    private int age;
}

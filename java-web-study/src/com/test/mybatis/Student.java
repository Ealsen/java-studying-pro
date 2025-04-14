package com.test.mybatis;

import lombok.*;

@Setter
@Getter
// @NoArgsConstructor
// @AllArgsConstructor
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
public class Student {
    private String id;
    private String name;
    private String gender;
    private int age;
}

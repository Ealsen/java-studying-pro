package com.test.test;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    // @Before And @After 测试方法执行前和执行后执行
    // @Test 测试方法

    @Test
    public void method() {
        System.out.println("测试用例1.");
        Assert.assertEquals(21, 21);
    }

    @Test
    public void method2() {
        System.out.println("测试用例2.");
        Assert.assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }
}

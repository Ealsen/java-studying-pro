package com.entity;

/**
 * @author: Ealsen
 * @date: 2025/02/09
 * @description: 单例模式就是全局只能使用这一个对象，不能创建更多的对象
 */

public class SingleCase { // 私有化构造方法，防止外部创建对象
    private static SingleCase instance;

    private SingleCase(){}

    public static SingleCase getInstance() {
        // 单例模式就是全局只能使用这一个对象，不能创建更多的对象
        if(instance == null)
            instance = new SingleCase();
        return instance;
    }
}
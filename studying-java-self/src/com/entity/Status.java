package com.entity;

public enum Status {
    RUNNING("跑步"),STUDYING("学习"),PLAYING("玩");
    // Status(){}

    private final String statusName;    //枚举的成员变量
    Status(String statusName){    //覆盖原有构造方法（默认private，只能内部使用！）
        this.statusName = statusName;
    }

    public String getName() {   //获取封装的成员变量
        return statusName;
    }
}

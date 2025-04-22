package com.test.mybatis.mapper;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class StdTest2 {
    int ssid;
    String sname;
    String sgender;

    // public StdTest2() {
    //     System.out.println("StdTest2构造方法1...");
    // }
    //
    // public StdTest2(int ssid, String sname, String sgender) {
    //     System.out.println("StdTest2构造方法2...");
    //     this.ssid = ssid;
    //     this.sname = sname;
    //     this.sgender = sgender;
    // }
}

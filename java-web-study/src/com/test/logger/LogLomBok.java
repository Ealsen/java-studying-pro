package com.test.logger;

import lombok.extern.java.Log;

@Log(topic = "loggerFormLomBok")
public class LogLomBok {
    // https://www.bilibili.com/video/BV1CL4y1i7qR?t=229.0&p=50
    public static void main(String[] args) {
        System.out.println(log.getName());
        log.log(java.util.logging.Level.INFO, "Hello World");
    }
}

package com.test.logger;

import com.test.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class PropertyTest {
    public static void main(String[] args) throws IOException {
        // 通过日志管理器读取配置文件
        LogManager logManager = LogManager.getLogManager();
        // 读取配置文件
        logManager.readConfiguration(new FileInputStream("src/com/test/logger/property.properties"));
        // 输出日志
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.log(Level.CONFIG, "Hello JavaWeb!");
    }
}

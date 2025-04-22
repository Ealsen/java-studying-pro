package com.test.logger;

import com.test.Main;

import java.io.IOException;
import java.util.logging.*;

public class LoggerTest {
    public static void main(String[] args) throws IOException {

        // 日志Logger JUL
        Logger logger = Logger.getLogger(Main.class.getName()); // 获取Logger实例

        logger.setLevel(Level.ALL); // 设置日志级别
        logger.setUseParentHandlers(false); // 关闭父级处理器

        SimpleFormatter simpleFormatter = new SimpleFormatter(); // 创建简单格式
        ConsoleHandler consoleHandler = new ConsoleHandler(); // 创建控制台处理器
        consoleHandler.setLevel(Level.ALL); // 设置控制台日志级别
        logger.addHandler(consoleHandler); // 将控制台处理器添加到Logger中

        System.out.println(logger.getParent().getClass()); // 获取父级Logger

        // 文件日志
        FileHandler fileHandler = new FileHandler("src/com/test/logger/logFile.log", true); // 创建文件处理器 true表示追加日志
        fileHandler.setLevel(Level.WARNING);
        fileHandler.setFormatter(simpleFormatter); // 设置日志格式
        logger.addHandler(fileHandler);

        // 日志输出
        logger.info("Hello JavaWeb!");
        logger.log(Level.CONFIG, "Hello Config Test!");
        logger.log(Level.INFO, "Hello Info Test!");
        logger.log(Level.WARNING, "Hello Warning Test!");
        logger.log(Level.SEVERE, "Hello Severe Test!");
    }
}

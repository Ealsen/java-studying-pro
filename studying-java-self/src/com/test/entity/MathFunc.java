package com.test.entity;

public class MathFunc {

    // add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
    
    // add three numbers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    // subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }

    // multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // divide two numbers
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // 菲波那切数列
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 九九乘法表
    public static void printMultiplicationTable(int longestNum) {
        for (int i = 1; i <= longestNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
    // 计算阶乘
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 水仙花数
    public static boolean isPentagonal(int n) {
        int temp = (int) (Math.sqrt(24 * n + 1) + 0.5);
        return (temp * (3 * temp - 1)) / 2 == n;
    }

    // 回文数
    public static boolean isPalindrome(int n) {
        int temp = n;
        int reverse = 0;
        while (temp!= 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return n == reverse;
    }

    // Test Function testFuncNoneNameNo1
    public static int testFuncNoneNameNo1(int a) {
        if (a == 0)
            return 0;
        return testFuncNoneNameNo1(a - 1) + a;
    }
}

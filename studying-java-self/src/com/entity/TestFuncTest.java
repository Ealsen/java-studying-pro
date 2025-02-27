package com.entity;

/**
 * @author Ealsen
 * @date 2025/02/09
 * @description 测试类
 */

// 静态导入

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

import static com.entity.TestClassDemo1.printHelloString1;

public class TestFuncTest {


    public static void testTestttsxs() {
        SingleCase test = SingleCase.getInstance();
        System.out.println(test);
    }

    public static void personTestLimitedowjdo() {
        Person person = new Person() {
            // @Override
            // public void examTest() {
            //     System.out.println("Person examTest()");
            // }
        };
        //  person.setNameLimited("大明");  // 调用setNameLimited()方法 限制了不能输入姓名中包含"大"的字符串
        person.setNameLimited("小明");
        System.out.println(person.getName());
    }

    public static void testClassDemoTest1wews() {
        Person person = new Person() {
            // @Override
            // public void examTest() {
            //     System.out.println("Person examTest()");
            // }
        };
        person.setName("小明");
        person.setAge(18);
        final int NotChangeNumber = 10;
        System.out.println(NotChangeNumber);
        person.setGender("男");
        System.out.println(person.getName() + " " + person.getAge() + " " + person.getGender());
        System.out.println(Person.info);
        System.out.println(MathFunc.add(1, 2));
        TestClassDemo1 wswsw = new TestClassDemo1();
        System.out.println(wswsw.getTestNum());
        // 静态导入printHelloString1()方法并调用
        printHelloString1();
    }

    public static void testStudentSuperWWSssad() {
        Student student = new Student();
        student.name = "小明";
//        student.printFatherClassName();
//        student.printSelfClassName();
    }

    public static void teststdwokSS() {
        Student student = new Student();
        Worker worker = new Worker();
        student.study();
        worker.working();
        Person personSon = new Student(); // 父类实例化 以父之名调用方法
        if (personSon instanceof Student) { // instanceof 运算符 判断对象是否为某种类型或者其子类
            System.out.println("personSon instanceof Student");
        }
        personSon.setName("小明");
        personSon.setAge(18);
        personSon.setGender("男");
        Student studentSon = (Student) personSon;
        studentSon.study();
        System.out.println(personSon.getName() + " " + personSon.getAge() + " " + personSon.getGender());;

    }

    public static void testEqualWswswsws() {
        Student student = new Student();
        Student student2 = new Student();
        student.name = "小明";
        student2.name = "小明";
        if (student.equals(student2)) {
            System.out.println("student equals student2");
        } else {
            System.out.println("student not equals student2");
        }

        Person p1 = new Person("小明", 18, "男") {
            // @Override
            // public void examTest() {
            //     System.out.println("Person examTest()");
            // }
        };
        System.out.println(p1.toString());
    }

    public static void testTestTodWswswswsws() {
        Student student = new Student();
        student.name = "小明";
        // student.examTest();
        };

    public static void testInterfaceTestWid() {
        Student student = new Student();
        student.name = "小明";
        student.study();
        student.play();
    }

    public static void TestCloneableTest() throws CloneNotSupportedException {
        StdCl cl = new StdCl();
        cl.name = "小明";
        cl.age = 18;
        cl.gender = "男";
        StdCl cl2 = (StdCl) cl.clone();

        System.out.println(cl.toString());
        System.out.println(cl2.toString());
        System.out.println(cl == cl2);
        System.out.println(cl.equals(cl2));
    }

    public static void testStuEnum1() {
        Student stu = new Student();
        // 给枚举的属性赋值
        // stu.setStatus(Status.valueOf("xxx")); // 字符串xxx 不存在，所以会抛出异常
        stu.setStatus(Status.RUNNING);
        System.out.println(stu.getStatus().getName());
    }

    public static void testObjAdvanced() {
        // 基本类型包装类
        // 装箱
        Integer num_1 = new Integer(10);
        Integer num_2 = 10;
        // 拆箱
        int num_3 = num_1;
        int num_4 = num_2;

        // 不同实列的
        System.out.println(num_1 == num_2);  // false 不同实列

        // 自动装箱
        Integer num_5 = 10;
        System.out.println(num_2 == num_5); // true 自动装箱

        // 自动转换
        String str = "123";
        Integer num_6 = new Integer(str);
        System.out.println(num_6);

        Integer num_7 = Integer.decode("0xff"); // 十六进制 0xff 十进制 255
        System.out.println(num_7);

        System.out.println(Integer.toBinaryString(num_7)); // 二进制

        System.out.println("0x" + Integer.toHexString(num_7));

        // equals() 方法
        System.out.println(num_1.equals(num_2));

        // Integer 的 MAX VALUE 和 MIN VALUE
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // 类似Integer的还有 Long、Short、Byte、Double、Float、Character
        // 包装类的值不能更改

        // 特殊的包装类
        Void v_test = null;
        System.out.println(v_test);
        BigInteger big_num_1 = BigInteger.valueOf(10);
        BigInteger big_num_2 = big_num_1.add(BigInteger.TEN);
        System.out.println(big_num_2);


        // 数组
        int[] arr_1 = new int[] {1, 2, 3, 4, 5, 6};
        // print all arr elements
        for (int j : arr_1) {
            System.out.println(j);
        }
        int[][] arr_2 = { {1, 2},
                {3, 4},
                {5, 6}};   //一个三行两列的数组
        System.out.println(arr_2[2][1]);   //访问第三行第二列的元素
    }

    // 可变长参数
    public static void testVarArgs(int... args) {
        for (int i : args) {
            System.out.println(i);
        }
    }

    public static void stringTestFunc() {
        String str1 = "Hello world";
        String[] str2 = str1.split(" ");  // 切割字符串
        for (String i : str2) {
            System.out.println(i);
        }

        StringBuilder str3 = new StringBuilder("Hello world"); // StringBuilder
        str3.append("!");
        System.out.println(str3.toString());
        str3.replace(0, 5, "Hi");
        System.out.println(str3.toString());
        str3.append("!").append("!");
        System.out.println(str3.toString());
    }

    // 正则表达式 判断163邮箱的格式
    public static void testRegex(String str) { // 正则表达式
        String regex = "^[a-zA-Z0-9_-]+@163.com$";
        boolean isMatch = str.matches(regex);
        System.out.println(isMatch);
    }

    public static void testRegexFunc() {
        String str = "abc@1631.com"; // false
        testRegex(str);
    }

    public static void testInnerClass() {
        TestInner testInner = new TestInner(); // 创建外部类
        testInner.num = 10;
        testInner.printNum();
        TestInner.Inner inner = testInner.new Inner(); // 创建内部类
        inner.num_inner = 20;
        inner.printNum();
    }

    public static void testAbstractClass() {
        // 匿名内部类
        AbStudent abStudent = new AbStudent() {
            @Override
            public void printInfo() {
                System.out.println("printInfo()");
            }
        };
        abStudent.printInfo();
    }

    public static void testInterfaceLambda() {
        study study = () -> { // lambda 表达式
            System.out.println("study() start");
        };
        study.study();
    }

    public static void testInterfaceTestFuncSum() {
        // TestFuncSum testFuncSum = (a, b) -> {
        //     System.out.println("TestFuncSum.TestFuncAdd()");
        //     return a + b;
        // };

        TestFuncSum testFuncSum = Integer::sum; // 方法引用
        System.out.println(testFuncSum.TestFuncAdd(10, 20));
    }

    // 抛出异常 除数不能为0
    public static int testDivide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("除数不能为0");
        }
        return a / b;
    }

    // 测试 1/0
    public static void testExceptionTestDivide() throws Exception {
        testDivide(10, 0);
    }

    // 捕获异常 让程序正常运行
    public static void testExceptionTestDivide2() {
        try { // 手动的捕获异常
            testDivide(10, 0);
        } catch (Exception e) {
            System.out.println("捕获异常：" + e.getMessage());
        } finally { // 无异常 finally 语句 也会执行
            System.out.println("finally");
        }
    }

    // 断言表达式
    public static void testAssert() {
        int i = 110;
        assert i == 10 : "断言表达式没有通过";
        // System.out.println("断言表达式通过");
    }

    // math工具类
    // 静态方法 Math.addExact(int a, int b) 等等

    // random 工具类
    public static void testRandom() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            System.out.println(num);
        }
    }

    // Array 工具类
    public static void testArray() {
        int[] arr = { 3, 6, 7, 4, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    // 冒泡排序
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return array;
    }

    // test 冒泡排序
    public static void testBubbleSort() {
        int[] arr = { 3, 6, 7, 4, 5};
        int[] result = bubbleSort(arr);
        System.out.println(Arrays.toString(result));
    }

    // binarySearch 二分查找
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = array[mid];
            if (midValue == target) {
                return mid;
            } else if (midValue > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }


    // test 冒泡排序 and binarySearch 二分查找
    public static void testBinarySearch() {
        int[] arr = { 3, 6, 7, 4, 5,2,3,4,5,6,7,8};
        int[] result = bubbleSort(arr);
        System.out.println(Arrays.toString(result));
        int target = 8;
        int result2 = binarySearch(result, target);
        System.out.println(result2);
    }

    public static void testClassScoreFanxing() {
        Score<String,String,Integer> score = new Score<>("张三","1001", 90);
        Score<String,String,String> score2 = new Score<>("李四","1002", "A");
        System.out.println(score.name + " " + score.id + " " + score.value);
        System.out.println(score2.name + " " + score2.id + " " + score2.value);
    }

    public static class ScoreScore extends Score<String, String, Integer> {
        public void playForward(Integer Value) {
            if (Value > 90)
                System.out.println("Play very happy");
        }
    }

    public static void testClassScoreScore() {
        ScoreScore score = new ScoreScore();
        score.playForward(100);
    }

    // 泛型方法
    public static <T> void testGenericFunc(T t) {
        System.out.println(t);
    }

    // test 泛型方法
    public static void testGenericFunc() {
        testGenericFunc(10);
        testGenericFunc("hello");
    }

    // compare
    public static void testCompareO() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // 降序
            }
        };
        Integer[] arr = { 3, 6, 7, 4, 5};
        Stream<Integer> array = Arrays.stream(arr).sorted(comparator);
        System.out.println(Arrays.toString(array.toArray()));

        // or
        Integer[] arrary1= { 3, 6, 7, 4, 5};
        Arrays.sort(arrary1, (o1,o2) -> o2-o1);
        System.out.println(Arrays.toString(arrary1));
    }

    // 界限
    public static void testJieXian() {
        JieXian<String,String> jieXian = new JieXian<>("张三","1001","90");
    }

    /*
    访问权限修饰符（Access Modifier）
    访问权限修饰符用来控制对类、属性、方法的访问权限。Java共有四种访问权限修饰符：public、protected、default（缺省）、private。
    访问权限修饰符的作用主要有以下几点：
    1. 保护类、属性、方法不被外界直接访问，防止代码被恶意修改或被其他代码恶意调用。
    2. 隐藏实现细节，提高代码的可读性和可维护性。
    3. 实现多态，实现代码的可扩展性。
    4. 隐藏内部实现，防止代码被修改或被其他代码调用。

    访问权限修饰符的使用原则：
    1. public：公共访问权限修饰符，可以被所有类、对象访问。
    2. protected：受保护访问权限修饰符，可以被同一个包内的类、子类访问。
    3. default（缺省）：缺省访问权限修饰符，可以被同一个包内的类访问。
    4. private：私有访问权限修饰符，只能被当前类访问。

    访问权限修饰符的使用范围：
    |           | 当前类 | 同一个包下的类 | 不同包下的子类 | 不同包下的类 |
    | :-------: | :----: | :------------: | :------------: | :----------: |
    |  public   |   ✅    |       ✅        |       ✅        |      ✅       |
    | protected |   ✅    |       ✅        |       ✅        |      ❌       |
    |   默认    |   ✅    |       ✅        |       ❌        |      ❌       |
    |  private  |   ✅    |       ❌        |       ❌        |      ❌       |

     */




/* //    未引入包写的代码，因为引入包会导致代码无法运行，所以注释掉了。
    public static void testClassDemoTest1w() {
        TestClassDemo1 w = new TestClassDemo1();
        System.out.println(w.testNum);
    }


    public static void testPerson2() {
        Person p1 = new Person("小明", 18, "男");
        System.out.println("PersonTest1:" + p1.name + " " + p1.age + " " + p1.gender + " " + Person.info);
        // Person p2 = new Person();
//        p2.setInfo("1");
        Person.info = "1";
        System.out.println(Person.info);
//        System.out.println(p1.info);
        System.out.println(Person.info);
    }

    public static void rePersonTest1() {
        Person p1 = new Person("小明", 18, "男");
        System.out.println("PersonTest1:" + p1.name + " " + p1.age + " " + p1.gender);
    }

    public static void mathFuncTestMathFuncTest() {
        System.out.println("TempNum = " + MathFunc.testFuncNoneNameNo1(100));
    }

    public static void mathFuncTest1() {
        System.out.println("MathFunc.add(11.123, 2) = " + MathFunc.add(11.123, 2));
    }

    public static void personTest1() {
        // 创建一个Person类的实例
        Person p1 = new Person();
        // 设置实例的name属性为"小明"
        p1.name = "小明";
        // 设置实例的age属性为18
        p1.age = 18;
        // 设置实例的gender属性为"男"
        p1.gender = "男";

        // 打印输出"Hello world!"
        System.out.println("Hello world!");

        // 创建另一个Person类的实例
        Person p2 = new Person();
        p2.name = "小红";
        p2.age = 19;
        p2.gender = "女";

        // 打印输出p1和p2的信息
        System.out.println(p1.name + "今年" + p1.age + "岁，" + p1.gender + "。");
        System.out.println(p2.name + "今年" + p2.age + "岁，" + p2.gender + "。");
    }

    public static void HuiwenTest1() {
        // 打印iPalindrome(12321)的结果
        System.out.println(MathFunc.isPalindrome(12321));
        Person p1 = new Person();
        p1.name = "小明";
        p1.age = MathFunc.fibonacci(10);
        p1.gender = "男";
        System.out.println(p1.name + "今年" + p1.age + "岁，" + p1.gender + "。");
    }

    public static void personTest2() {
        // 创建一个Person类的实例
        Person p1 = new Person();
        // 设置实例的name属性为"小明"
        p1.setName("小明");
        // 设置实例的age属性为18
        p1.setAge(12);
        // 设置实例的gender属性为"男"
        p1.setGender("男");
        // 打印输出p1的信息
        System.out.println(p1.name + "今年" + p1.age + "岁，" + p1.gender + "。");
    } */

}

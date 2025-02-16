package com.test.entity;

/**
 * @author Ealsen
 * @date 2025/02/09
 * @description 测试类
 */

// 静态导入
import static com.test.entity.TestClassDemo1.printHelloString1;

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

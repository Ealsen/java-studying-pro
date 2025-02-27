package com.entity;

public  class Person { // Abstract class Person
    // 继承Abstract Class Person类的子类必须实现抽象方法examTest()
    // Default values
    String name = "Unknown";
    int age = 0;
    String gender = "Unknown";

    public static String info = "This is a Person class.";

    // Default constructor
    public Person() {}

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age; 
    }

    public String getGender() {
        return gender;
    }

//    void setInfo(String info) {
//        this.info = info;
//    }

    public String getInfo() {
        return info;
    }

    public void setNameLimited(String name) {
        if (name.contains("大")) return;
        this.name = name;
    }

    @Override   //重写方法可以添加 @Override 注解，有关注解我们会在最后一章进行介绍，这个注解默认情况下可以省略
    public boolean equals(Object obj) {   //重写方法要求与父类的定义完全一致
        if(obj == null) return false;   //如果传入的对象为null，那肯定不相等
        if(obj instanceof Person) {     //只有是当前类型的对象，才能进行比较，要是都不是这个类型还比什么
            Person person = (Person) obj;   //先转换为当前类型，接着我们对三个属性挨个进行比较
            return this.name.equals(person.name) &&    //字符串内容的比较，不能使用==，必须使用equals方法
                    this.age == person.age &&       //基本类型的比较跟之前一样，直接==
                    this.gender.equals(person.gender);
        }
        return false;
    }

    // 重写toString方法，方便打印对象信息
    @Override
    public final String toString() { // toString方法要求与父类的定义完全一致
        // final关键字表示方法不能被重写，这里的toString方法是final的，不能被重写
        // 公交车私有化
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    // public abstract void examTest(); // 抽象方法，子类必须实现
}

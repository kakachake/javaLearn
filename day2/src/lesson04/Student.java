package lesson04;

/*
* 一个标准的类通常要满足下面四个组成部分
*
* 1.所有的成员变量都要使用private关键字修饰
* 2.为每个成员变量编写一对儿Getter/Setter方法
* 3.编写一个无参数的构造方法
* 4.编写一个全参数的构造方法
*
*
* 标准的类也叫做Java Bean
*
* 快捷设置setter/getter/constructor
* alt+insert
* */

public class Student {

    private String name; //姓名
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

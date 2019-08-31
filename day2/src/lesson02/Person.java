package lesson02;

/*
* 问题描述:定义Person的年龄时，无法阻止不合理的数值被设置进来。
* 解决方案：用private关键字将要保护的成员变量进行修饰
*
* 一旦使用private进行修饰，那么本类当中仍然可以随意访问
* 但是超出本类范围之外就不能直接访问了
* */

public class Person {
    String name;
    private int age;

    public static void main(String[] args) {
        System.out.println("我启动了");
    }

    public void show() {
        System.out.println("我叫"+ name);
    }

    public void setAge(int age) {
        if(age > 0 && age < 100)
        this.age = age;
        else{
            System.out.println("年龄输入错误");
        }
    }


    public int getAge() {
        return age;
    }


}

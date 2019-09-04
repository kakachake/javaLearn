package lesson01;
/*
 * 静态代码块的格式是：
 *
 * public class 类名称{
 *
 * }
 *
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次
 * 静态内容总是优先于非静态，所以静态代码块比构造方法先执行。
 *
 * 静态代码块的典型用途
 * 用来一次地对静态成员变量进行赋值
 * */


public class Demo02Static {

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
    }
}

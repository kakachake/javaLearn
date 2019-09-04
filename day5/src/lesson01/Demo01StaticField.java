package lesson01;

/*
*
* 如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。
* 多个对象共享同一份数据
*
*
* //静态方法可以访问静态变量，但是不能访问非静态
* //成员方法可以访问成员变量也可以访问静态变量
* 因为内存中现有的静态内容又有的非静态内容
*
*
* //静态方法不能用this
* 原因：this代表当前对象，通过谁调用的方法，谁就是当前对象
* */

public class Demo01StaticField {

    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);
        one.room = "101教室";
        System.out.println(one.getName()+one.getAge()+one.room+one.getId());
        Student two = new Student("黄蓉", 16);
        System.out.println(two.getName()+two.getAge()+two.room+two.getId());
        System.out.println(Student.room);
    }

}
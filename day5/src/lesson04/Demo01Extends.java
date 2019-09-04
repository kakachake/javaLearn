package lesson04;

/*
* 在继承关系中，子类就是一个父类，也就是说，子类可以当作父类看待
*
*
* 定义父类的格式：（就是一个普通的类定义）
*
* public class 父类名称{
*   //...
*
* 定义子类格式：
* public class 子类名称: extends 父类名称{
*   //...
* }
* */

public class Demo01Extends {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //继承了Employee的方法
        teacher.method();
        Assistant assistant = new Assistant();
        assistant.method();
    }
}

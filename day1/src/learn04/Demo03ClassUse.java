package learn04;
import learn04.Demo02ClassStu;


/*
* 通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用
* 1.导包，也就是指出需要使用的类在什么位置
* import 包名称，类名称
* import learn04.Demo02ClassStu;
* 对于和当前类属于同一个包的情况，可以省略导包语句不写
*
* 2.创建
* 类名称 对象名 = new 类名称();
* Demo02ClassStu stu = new Demo02ClassStu();
*
* 3.使用
* 使用成员变量： 对象名.成员变量名
* 使用成员方法： 对象名.成员方法名
*
* 如果成员变量没有进行赋值，那么将会有一个默认值
* */

public class Demo03ClassUse {
    public static void main(String[] args) {
        Demo02ClassStu stu = new Demo02ClassStu();
        stu.age = 20;
        System.out.println(stu.toString());
        System.out.println(stu);
        stu.eat();
        stu.sleep();
        stu.study();
    }
}

package learn04;

/*
* 定义一个类用来模拟“学生”
*
* 属性（是什么）
*   姓名
*   年龄
* 行为（能做什么）
*   吃饭
*   睡觉
*   学习
*
* 对应到JAVA类中，
*
* 成员变量（属性）
*   String name //姓名
*   int age; //年龄
* 成员方法（行为）
*   public void eat() //吃饭
*   public void sleep() //睡觉
*   public void study() //学习
* 注意：
* 1.成员变量是直接定义在类当中的，在方法外边
* 2.成员方法不要写static关键字
* */

public class Demo02ClassStu {
    public static void main(String[] args) {
        System.out.println("哈哈哈");
    }

    //成员变量
    String name; //姓名
    int age; //年龄

    //成员方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void  study() {
        System.out.println("学习");
    }

}

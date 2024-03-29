package lesson07;

/*
* 在父子类的继承关系中，创建子类对象，访问成员方法的规则
*   创建的对象是谁，就优先用谁，如果没有则向上找。
*
*   注意事项：
*   无论是成员方法还是成员变量，都是没有则想上找
*
*   重写（Override）
*   概念：在继承关系当中，方法名称一样，参数列表页一样，
*   重写（Override）:方法的名称一样，参数列表【也一样】
*   重载（Overload）,方法名称一样，参数列表【不一样】
*
* */

public class Demo01ExtendsMethod {

    public static void main(String[] args) {
        SonClass son = new SonClass();
        son.mothedFu();
        son.methodZi();
        son.method();
    }
}

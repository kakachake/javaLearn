package lesson01;

/*
* 在多态的代码当中，成员方法的访问规则是：
*   看new的是谁就优先用谁，没有则向上找
*
* 口诀：编译看左边，运行看右边
*
* 对比：
* 成员变量，编译看左边，运行还看左边。
* 成员方法：编译看左边，运行看右边
* */

public class Demo02MultiMethod {
    public static void main(String[] args) {

        Fu obj = new Zi();
        obj.method();

        //编译看左，左边是Fu,Fu没有methodZi方法，所以编译报错
//        obj.methodZi();//错误写法
    }
}

package demo01;

/*
* 抽象方法，就是加上abstract关键字，然后去大括号，直接分号结束。
        * 抽象类：抽象方法所在的类必须是抽象类才行，在class之前协商abstract即可
        *
        * 如何使用抽象类和抽象方法
        * 1.不能直接创建new抽象对象
        * 2.必须用一个子类来继承抽象父类
        * 3.子类必须覆盖重写父类当中所有的抽象方法
        * 4.创建子类对象进行使用
        * */

public abstract class Animal {

    //这是一个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定
    public abstract void eat() ;


    //可以定义普通的成员方法
    public void normalMethod(){
        System.out.println("normal method");
    }
}


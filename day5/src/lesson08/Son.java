package lesson08;

/*
* 子类构造方法中默认有一个super()调用
*
* 只有子类构造方法能调用父类构造方法
*
*
* super必须是构造方法中的第一个语句
*
* 子类必须调用父类构造方法，不写则赠送super()，写了则用重写的方法，super只有一个，还必须
* 是第一个语句。
*
* super关键字的用法有三种：
* 1. 在子类的成员中，访问父类的成员变量
* 2. 在子类的成员方法中，访问父类的成员方法
* 3. 在子类的构造方法中，访问父类的构造方法
*
*
* this关键字用来访问本类内容，用法也有三种
* 1.在本类的成员方法中，访问本类的成员
* 2.在本类的成员方法中，访问本类的另一个成员方法
* 3.在本类的构造方法中，访问本类的另一个构造方法 this()
*   A this(...)调用也必须是构造方法中的第一个语句
*   B this()和super()不能同时使用，因为二者都必须为第一个
* */

public class Son extends Father {

    Son(){

    }

    Son(int num){
        super(num);//调用父类重载的构造方法
    }

    public void method(){
        System.out.println(super.num);//访问父类的成员变量
        super.method();
        System.out.println("这是子类的方法");
    }
}

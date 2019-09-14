package lesson01;

/*
* 代码当中体现多态性，其实就是一句话，父类指向子类对象
* 格式：
* 父类名称 对象名 = new 子类名称();
* 或者
* 接口名称 对象名 = new 实现类名称();
*
* 访问成员变量的两种方式：
* 1.直接通过对象名称访问成员变量，看等号左边是谁，优先用谁，没有则向上找
* 2.间接通过成员方法访问成员变量: 看该方法属于谁，优先用谁，没有则向上找
* */

public class Demo01Multi {

    public static void main(String[] args) {
        //使用多态的方法
        Fu obj = new Zi();
        Zi obj2 = new Zi();

        System.out.println(obj.num); //父类的num
        System.out.println(obj2.num);  //子类的num
        obj.method();
        obj.getNum();
        obj2.method();
    }
}

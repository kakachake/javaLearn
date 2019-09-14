package lesson02;


/*
* 1.对象的向上转型，其实就是多态写法：
* 父类名称 对象名 = new 子类名称();
* 含义：右侧创建一个子类对象，把它当作父类看待使用
* 注意：
*   1.向上转型一定是安全的，因为是从小范围转向了大范围
*   2.对象一旦向上转型为父类，那么就无法调用子类原本特有的内容
*
* 解决方案：用对象的向下转型【还原】.
* 2.对象的向下转型，其实就是一个【还原】的动作。
* 格式：子类名称 对象名 = (子类名称) 父类对象
* 注意：
* 向下转型一定要进行instanceof判断
* */

public class Demo01 {

    public static void main(String[] args) {
        //对象的向上转型就是父类的引用指向子类的对象
        Animal animal = new Cat();
        animal.eat();

//        animal.catchMouse();//错误写法
        Cat cat = (Cat)animal;
        cat.catchMouse();

        //必须保证对象本来创建的时候就是猫，才能向下转型成为猫
        //编译不会报错，但是运行会出现异常
        //java.lang.ClassCastExceprtion,类转换异常
//        Dog dog = (Dog)animal;//错误写法
//        dog.eat();
    }
}

package lesson01;
/*
* 定义一个类，用来模拟手机
*
* */
public class Phone {

    //成员变量
    String brand; //品牌
    double price; //价格
    String color; //颜色

    //成员方法
    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }
}

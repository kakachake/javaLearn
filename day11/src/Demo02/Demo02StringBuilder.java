package Demo02;

/*
* StringBuilder的常用方法
* append: 添加任意类型数据的字符串形式，并返回当前对象自身
* toString：将当前的StringBuilder对象转换为String对象
* */

public class Demo02StringBuilder {

    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        bu.append("abc"); //无需接收返回值
        System.out.println(bu);
        bu.append(1);
        bu.append(true);
        bu.append(8.8);
        bu.append('中');
        System.out.println(bu);

        /*
        * 链式编程：方法返回值是一个对象，可以继续调用方法
        * */
        System.out.println("abc".toLowerCase().toUpperCase());
        bu.append("abc").append(1).append("中");//链式编程
        System.out.println(bu);
    }
}

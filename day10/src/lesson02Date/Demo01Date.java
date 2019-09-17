package lesson02Date;

/*
* java.util.Date 表示日期和时间的类
* 类Date表示特定的瞬间，精确到毫秒
*
* 把日期转换为毫秒
* 当前日期：2019-9-17
* 时间原点（0毫秒）：1970-1-1 00：00：00  （英国格林威治时间）
* 就是当前日期到时间原点之间一共经历了多少毫秒(long类型)
* 一天 = 24*60*60 = 86400秒 = 86400000毫秒
*
* 注意：
*   中国属于东八区，会把时间增加8个小时
* */

import java.util.Date;

public class Demo01Date {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        demo01(); //空参数
        demo02(); //带参数
        demo03(); //getTime()
    }

    /*
    * long getTime()把日期转换为毫秒(相当于System.currentTimeMillis())
    * */
    private static void demo03() {
        System.out.println(new Date().getTime());
    }


    /*
    * Date类带参数的构造方法
    * Date(long date):传递毫秒值，把毫秒值转换为Date日期
    * */
    private static void demo02() {
        Date date = new Date(0);
        System.out.println(date);//东八区：时间加八小时
        date = new Date(System.currentTimeMillis());
        System.out.println(date);
    }

    /*
    * Date类的空参数构造方法
    * Date()获取当前系统的日期和时间
    * */

    private static void demo01() {
        Date date = new Date();
        System.out.println(date.toString());
    }


}

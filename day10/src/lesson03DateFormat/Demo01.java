package lesson03DateFormat;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/*
* java.text.DateFormat是日期/时间格式化子类的抽象类
* 作用：
*       格式化（也就是日期->文本） 解析（文本->日期）
* 成员方法：
*       String format(Date date)按照指定的模式，把Date日期格式化为符合模式的字符串
*       Date parse(String source) 把符合模式的字符串，解析为Date日期
* DateFormat类是一个抽象类，我们无法直接创建对象，可以使用其子类：
*       SimpleDateFormat
*       构造方法
*          SimpleDateFormat(String pattern)
*            用给定的模式和默认语言环境的日期格式构造
*          参数：
*               字符串类型参数：传递指定的模式
*          模式：区分大小写
*           y
*           M
*           d
*           H
*           m
*           s
*           写对应的模式会把模式替换为对应的日期和时间
*
*           注意：模式中的字母不能更改
* */
public class Demo01 {

    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }


    /*
    * 使用DateFormat中的方法Parse,把文本解析为日期
    * 注意：
    *   public Date parse(String source) throws ParseException
    *   parse方法声明了一个异常叫“解析异常”
    *   如果字符串和构造方法的模式不一样，那么程序抛出此异常
    *   调用一个抛出异常的方法，就必须处理这个异常，要么throws继续抛出这个
    *   异常，要么try catch自己处理异常
    * */
    private static void demo02() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse("2019-09-17 19:59:57");
        System.out.println(date);
    }

    /*
    * 使用DateFormat类中的方法format,把日期格式化为文本
    * 使用步骤：
    *   1.创建SimpleFormat对象，构造方法中传递指定的模式
    *   2.调用SimpleFormat对象中的方法format，按照构造方法中指定的模式，把
    *   Date日期格式格式化为符合模式的字符串文本
    * */
    private static void demo01() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String str = format.format(date);
        System.out.println(str);
    }
}

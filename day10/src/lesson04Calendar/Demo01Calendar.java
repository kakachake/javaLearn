package lesson04Calendar;

/*
* java.util.Calendar类：日历类
* Calendar类是一个抽象类，里面提供了很多操作日历字段的方法（YEAR、MONTH、DAY_OF_MONTH、HOUR）
* Calendar类无法直接创建对象使用，里面有一个静态方法getInstance(),该方法返回了
* Calendar的子类对象
*
* 常用方法：
*   public int get(int field): 返回给定日历字段的值
*   public void set(int field, int amount): 根据日历的规则，为给定的日历字段添加或
*   减去指定的时间量
*   public abstract void add(int field, int amount)：根据日历的规则，为给定日历字段
*   添加或减去指定时间量
*   public Date getTime()；返回一个表示此Calendar时间值的Date对象
* 成员方法参数：
*       int field:日历类的字段，可以使用Calendar类的静态成员变量获取
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo01Calendar {

    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance(); //多态
        System.out.println(c);
        System.out.println(c.getTime());

        demo01(); //get方法
        demo02(); //set方法
        demo03(); //add方法
        demo04(); //getTime方法
        demo05(); //setTime方法
    }

    private static void demo05() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse("1999-06-15 18:00:00");
        Calendar c = Calendar.getInstance(); //多态
        c.setTime(date);
        System.out.println(c.getTime());
    }


    /*
    * getTime()
    * 把日历对象转换为日期对象
    * */
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.toString());
        System.out.println(c.getTimeInMillis());
    }

    /*
    * add方法：
    * 把指定的字段增加或减少指定的值
    * 参数：
    *       int field:给指定字段设置的值,
    *       int amount:增加减少指定的值
    * */
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.add(c.YEAR,2);
        System.out.println(c.getTime());//年+1
    }

    /*
    * public void set(int field, int value):将指定的日历字段设置为给定值
    * 参数：
    *       传递指定的日历字段（YEAR,MONTH...）
    *       int value:给指定字段设置的值
    * */
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.set(Calendar.YEAR, c.get(Calendar.YEAR)+1);//设置年+1
        c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);//设置年+1
        c.set(Calendar.DATE, c.get(Calendar.DATE)+1);//设置年+1
        System.out.println(c.getTime());
        //同时设置年月日：可以使用set的重载方法
        c.set(2022,2,15);
        System.out.println(c.getTime());
    }

    /*
    * public int get(int field):返回给定的日历字段的值
    * 参数：传递指定的日历字段（YEAR,MONTH）
    * 返回值：日历字段代表的具体的值
    * */
    private static void demo01() {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH));

        System.out.println(c.get(Calendar.AM_PM));
    }
}

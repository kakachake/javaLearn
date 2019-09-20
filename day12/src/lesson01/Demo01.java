package lesson01;

/*
* 包装类：
*   基本数据类型，使用起来非常方便，但是没有对应的方法来操作这些基本类型的数据
*   可以使用一个类，把基本类型的数据装起来，在类中定义一些方法，这个类叫做包装
*   类，我们可以使用类中的方法来操作这些基本类型的数据
*
*
* 装箱：
*   把基本类型的数据包装到包装类中（基本类型的数据->包装类）
*   构造方法：
*       Integer(int value)
          构造一个新分配的 Integer 对象，它表示指定的 int 值。
        Integer(String s)
          构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
            传递的字符串必须是基本类型的字符串，否则会抛出异常 “100”正确 “a"异常
    静态方法：
        static Integer valueOf(int i)
                  返回一个表示指定的 int 值的 Integer 实例。
        static Integer valueOf(String s)
                  返回保存指定的 String 的值的 Integer 对象。
  拆箱：
    在包装类中取出基本类型的数据（包装类->基本类型）
         int intValue()
          以 int 类型返回该 Integer 的值。
* */
public class Demo01 {

    public static void main(String[] args) {
        //装箱：把基本类型的数据，包装到包装类中：
        Integer i1 = new Integer(1);
        System.out.println(i1); //重写了toString方法

        Integer i2 = new Integer("1");
        System.out.println(i2);

        //静态方法
        Integer i3 = Integer.valueOf(1);
        System.out.println(i3);

        Integer i4 = Integer.valueOf("1");
        System.out.println(i3);

        //拆箱
        int i = i4.intValue();
        System.out.println(i);
    }
}
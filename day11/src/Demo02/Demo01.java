package Demo02;

/*
*
*
*
* String类
*       字符串是常量，他们的值是在创建之后不能更改
*       字符串的底层是一个被final修饰的数组，不能改变，是一个常量
*       private final byte[] value;
*
* 进行字符串相加，内存中就会有多个字符串，占用空间多，效率低下
*
*
* StringBuilder类
*       字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）
*       底层也是一个数组，但是没有被final修饰，可以改变长度
*       byte[] value = new byte[16]; //初始容量16
*       如果超出了容量，会自动扩容
*
* java.lang.StringBuilder类：字符串缓冲区，可以提高字符串的效率
* 构造方法：
*   StringBuilder()
*       构造一个不带任何字符的字符串生成器，其初始容量为16字符
*   StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
* 常用成员方法：
* append: 添加任意类型数据的字符串形式，并返回当前对象自身
* toString：将当前的StringBuilder对象转换为String对象
* */

public class Demo01 {
    public static void main(String[] args) {
        //空参数构造方法
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder); //空字符串

        //带字符串的构造方法
        StringBuilder stringBuilder1 = new StringBuilder("abc");
        System.out.println(stringBuilder1);

    }

}

package lesson01;
/*
* java.lang.String类代表字符串
*
* 创建字符串的常见3+1种方式
* 三种构造方法
* public String(), 创建一个空白字符串
*
* 字符串常量池，程序当中直接写上的双引号字符串，就在字符串常量池中。
*
* 对于基本类型来说， ==是进行数值的比较。
* 对于引用类型来说， ==是进行 地址值 的比较。
* 双引号直接写的字符串在常量池中，new的不再池当中
* */

public class Demo01String {

    public static void main(String[] args) {
        String str1 = "abc"; //存在字符串常量池中
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}

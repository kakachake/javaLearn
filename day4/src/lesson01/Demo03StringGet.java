package lesson01;

/*
* String当中与获取相关的方法有：
*
* public int length(), 获取字符串当中含有的字符个数， 拿到字符串的长度。
*
* piblic String concat(String str),将当前字符串和参数字符串拼接成返回值新字符串
*
* public char charAt(int index)， 获取指定索引位置的单个字符。
*
* public int indexOf(String str),查找参数字符串在本字符串当中首次出现的索引位置，
* 如果没有返回-1
* */

public class Demo03StringGet {

    public static void main(String[] args) {
        //获取字符串的长度
        int len = "asdasasdfasdd".length();
        System.out.println(len); //字符串长度

        System.out.println("==============================");
        //拼接字符串
        String str1 = "Hello";
        String str2 = " World";
        System.out.println(str1.concat(str2));
        System.out.println(str1);

        System.out.println("==============================");


        //获取指定索引位置的字符
        char ch = "Hello".charAt(1);
        System.out.println(ch);

        System.out.println("==============================");

        //查找参数字符串在当前字符串中第一次的索引位置
        String str3 = "Hello World";
        int idx = str3.indexOf("World");
        System.out.println(idx);
        System.out.println(str3.indexOf("hi"));//找不到

    }
}

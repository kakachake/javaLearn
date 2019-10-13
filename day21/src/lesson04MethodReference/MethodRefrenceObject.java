package lesson04MethodReference;

import javax.print.DocFlavor;

public class MethodRefrenceObject {
    //定义一个成员方法，传递字符串，把字符串按照大写输出
    public void printUpperCaseString(String str){
        System.out.println(str.toUpperCase());
    }

    //定义一个静态成员方法
    public static void print(String str){
        System.out.println(str.toUpperCase());
    }
}

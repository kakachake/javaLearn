package lesson01;

import java.util.Objects;

public class Demo03Object {

    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "aBc";
        String s1 = null;
        String s2 = "aBc";
        String s3 = "aBc";
//        System.out.println(s1.equals(s2)); //空指针异常，null不能调用方法

        /*
        * Objects类中的equals方法:也是对两个对象进行比较，但是可以防止
        * 空指针异常
        * 源码:
        *     public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
              }
        * */
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.equals(s3, s2));
    }
}

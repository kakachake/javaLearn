package lesson02hashCode;
/*
* 哈希值：是一个十进制整数，由系统随机给出（就是对象的地址值，是模拟出来的地址，不是数据实际存储的地址）
* 在Object类有一个方法可以获取对象的哈希值
* hashCode方法的源码：
*   public native int hashCode
*   native代表方法调用的是本地操作系统的方法
* */

public class Demo01HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        System.out.println(p1.hashCode());
        System.out.println(Integer.toHexString(p1.hashCode()));
        System.out.println(p1.toString());
        /*
        * toString方法源码：
        *   return getClass().getName() + "@" + Integer.toHexString(hashCode());
        * */

        /*
        * String类的哈希值
        *   String类重写了Object类的hashCode方法
        * */
        String a = "123";
        String b = "123";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}

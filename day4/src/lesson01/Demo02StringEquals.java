package lesson01;

/*
* ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用以下两个方法：
*
* public boolean equals (Object obj): 参数可以是任何对象，只有参数是个字符串并且内容相同才会
* 给true,否则false
*
* 注意事项：
* 1.任何对象都能用Object进行接收
* 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
* 3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
* 推荐"abc".equals(str)
*
*
* public boolean equalsIgnoreCase(String str) 忽略大小写，进行内容比较
* */

public class Demo02StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println(str3.toString());
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));//推荐写法

        String str4 = null;
        System.out.println("abc".equals(str4)); //false
//        System.out.println(str4.equals("abc"));//报错

        String str5 = "Java";
        String str6 = "java";
        System.out.println(str5.equals(str6)); //fasle
        System.out.println(str5.equalsIgnoreCase(str6)); //true
    }
}

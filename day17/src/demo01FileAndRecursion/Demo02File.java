package demo01FileAndRecursion;

import java.io.File;

/*
* 路径：
*   绝对路径：是一个完整的路径
*       以盘符为开始的路径
*   相对路径：是一个简化的路径
*
*   注意：
*       1.路径不区分大小写
*       2.路径中的文件名分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
*
* */
public class Demo02File {

    public static void main(String[] args) {
        /*
        * File类的构造方法
        * */

        show01();
        show02("c:\\", "a.txt");
        show03();
    }

    /*
    * File(File parent, String child)
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
          参数：
                把路径分成了两部分
                    File parent: 父路径
                    String child: 子路径
           好处：
                父路径和子路径可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
                父路径是File路径，可以使用File类的方法对路径进行一些操作，再使用路径创建对象
    * */
    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file);
    }

    /*
    * File(String parent, String child)
          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
          参数：
                把路径分成了两部分
                    String parent: 父路径
                    String child: 子路径
           好处：
                父路径和子路径，可以单独书写，用起来非常灵活
    * */
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /*
    * File(String pathname) 通过将给定的路径名字字符串转换为抽象路径名来创建一个
    * 新File实例。
    * 参数：
    *   String pathname:字符串的路径名称
    *   路径可以是以文件结尾，也可以是以文件夹结尾
    *   路径可以是相对路径，也可以是绝对路径
    *   路径可以存在也可以不存在
    *   创建file对象，只是把字符串路径封装为file对象，不考虑路径的真假情况
    * */
    private static void show01() {
        File f1 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\1.txt");
        System.out.println(f1);//重写Object类的toString方法

        File f2 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17");
        System.out.println(f2);

        File f3 = new File("b.txt");
        System.out.println(f3);
    }
}

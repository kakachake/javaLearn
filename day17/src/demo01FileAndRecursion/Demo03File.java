package demo01FileAndRecursion;

import java.io.File;

/*
* File获取功能的方法：
*   public String getAbsolutePath() ：返回此File的绝对路径名字符串。
    public String getPath() ：将此File转换为路径名字符串。
    public String getName() ：返回由此File表示的文件或目录的名称。
    public long length() ：返回由此File表示的文件的长度。
* */
public class Demo03File {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    /*
    * public long length() ：返回由此File表示的文件的长度。
    * 获取的是构造方法指向的文件的大小，以字节为单位
    * 注意：
    *      文件夹是没有大小概念的，不能获取文件夹的大小
    *      如果构造方法中给出的路径不存在，那么length返回0
    * */
    private static void show04() {
        File f1 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\1.bmp");
        System.out.println(f1.length()); //字节为单位

        File f2= new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\2.bmp");
        System.out.println(f2.length()); //如果路径不存在，返回0

        File f3= new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17");
        System.out.println(f3.length()); //不能获取文件夹的大小
    }

    /*
    * public String getName() ：返回由此File表示的文件或目录的名称。
    * 获取的就是构造方法传递路径的结尾部分（文件/文件夹）
    * */
    private static void show03() {
        File f1 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\a.txt");
        System.out.println(f1.getName());
    }

    /*
    * public String getPath() ：将此File转换为路径名字符串。
    * */
    private static void show02() {
        File f1 = new File("a.txt");
        System.out.println(f1.getPath());
        File f2 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17");
        System.out.println(f2.getPath());
        System.out.println(f1.toString());//toString调用的就是getPath()
    }

    /*
    * public String getAbsolutePath(): 返回此File的绝对路径名字符串。
    * 获取的构造方法中传递的路径
    * 无论路径是绝对的还是相对的，getAbsolutePath方法返回的都是绝对路径
    * */
    private static void show01() {
        File f1 = new File("a.txt");
        System.out.println(f1.getAbsolutePath());
        File f2 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17");
        System.out.println(f2.getAbsolutePath());
    }
}

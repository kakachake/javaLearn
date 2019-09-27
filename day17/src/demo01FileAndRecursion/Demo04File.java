package demo01FileAndRecursion;


import java.io.File;

/*
* File判断功能的方法：
*   public boolean exists() ：此File表示的文件或目录是否实际存在。
    public boolean isDirectory() ：此File表示的是否为目录。
    public boolean isFile() ：此File表示的是否为文件。

    //路径必须是存在的，否则返回false

* */
public class Demo04File {

    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    /*
    * public boolean isFile() ：此File表示的是否为文件。
    * */
    private static void show03() {
        File f1 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\1.bmp");
        System.out.println(f1.isFile());

        File f2 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17");
        System.out.println(f2.isFile());
    }


    /*
    *  public boolean isDirectory() ：此File表示的是否为目录。
    * */
    private static void show02() {
        File f1 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\1.bmp");
        System.out.println(f1.isDirectory());

        File f2 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17");
        System.out.println(f2.isDirectory());
    }

    /*
    * public boolean exists() ：此File表示的文件或目录是否实际存在。
    * */
    private static void show01() {
        File f1 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\1.bmp");
        System.out.println(f1.exists());

        File f2 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\2.bmp");
        System.out.println(f2.exists());
    }
}

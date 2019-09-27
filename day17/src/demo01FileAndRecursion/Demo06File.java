package demo01FileAndRecursion;

/*
* public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
  public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

  注意：list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在，就会抛出空指针异常
        如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
* */

import java.io.File;
import java.util.Arrays;

public class Demo06File {

    public static void main(String[] args) {
        show01();
        show02();
    }

    //public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
    //会获取目录中所有的文件/文件夹，把文件/文件夹封装为File对象，存储到File数组中
    private static void show02() {

        File file = new File("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        File[] arr = file.listFiles(); //对目录进行遍历
        System.out.println(Arrays.toString(arr));//绝对路径
    }

    /*
    * public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
    * 遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到
    * 一个String类型数组中
    * */
    private static void show01() {

        File file = new File("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        String[] arr = file.list(); //对目录进行遍历
        System.out.println(Arrays.toString(arr));
    }
}

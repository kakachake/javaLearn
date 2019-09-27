package demo01FileAndRecursion;

/*
*
*   public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
    public boolean delete() ：删除由此File表示的文件或目录。
    public boolean mkdir() ：创建由此File表示的目录。
    public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
* */

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) {
        try {
            show01();
        } catch (IOException e) {
            e.printStackTrace();
        }


        show02();
    }

    /*
    * public boolean mkdir() ：创建由此File表示的目录。
      public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
    *   返回值：布尔值：
    *       true:文件夹不存在，创建文件，返回true
    *       false:文件夹存在，不会创建，返回false，构造方法中给出的路径不存在，也返回false
    *    注意：此方法只能创建文件夹不能创建文件
    * */
    private static void show02() {
        File f1 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\src\\demo01FileAndRecursion\\makeDir");
        System.out.println(f1.mkdir());

        File f2 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\src\\demo01FileAndRecursion\\111\\222\\333");
        System.out.println(f2.mkdirs());

        File f3 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\src\\demo01FileAndRecursion\\111.txt");
        System.out.println(f3.mkdirs()); //也是创建的文件夹
    }

    /*
    * public boolean createNewFile() ：
    *   当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
    *   返回值：布尔值：
    *       true:文件不存在，创建文件，返回true
    *       false:文件存在，不会创建，返回false
    *    注意：此方法只能创建文件不能创建文件夹
    *          文件创建的路径必须存在，否则抛出异常
    *    抛出IOException，我们必须处理这个异常，要么throws，要么try/catch
    * */
    private static void show01() throws IOException {
        File f1 = new File("D:\\java\\sharelink0-540460780915549\\javaLearn\\day17\\src\\demo01FileAndRecursion\\1.txt");
        System.out.println(f1.exists());
        System.out.println(f1.createNewFile());
        System.out.println(f1.exists());

        File f2 = new File("1.txt");
        System.out.println(f2.createNewFile());
        System.out.println(f2.getAbsolutePath());
    }


}

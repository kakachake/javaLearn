package demo01FileAndRecursion;

/*
* java.io.File类
* 文件和目录路径名的抽象表示形式
* java把电脑中的文件和文件夹（目录）封装为一个私有类，我们可以使用File类对文件和
* 文件夹进行操作
* 我们可以使用File类的方法
*       创建一个文件或文件夹
*       删除文件/文件夹
*       获取文件/文件夹
*       判断文件/文件夹是否存在
*       对文件夹进行遍历
*       获取文件的大小
* File类是一个与系统无关的类
* 任何操作系统都可以使用这个类的方法
* 重点:记住三个单词：
*       1.file:文件
*       2.directory:文件夹
*       3.path:路径
* */

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        /*
        *
        *   static String pathSeparator
                    与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
            static char pathSeparatorChar
                    与系统有关的路径分隔符。
            static String separator
                    与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
            static char separatorChar
                    与系统有关的默认名称分隔符。

            操作路径：路径不能写死,不同操作系统下不同：
                D:\java\sharelink0-540460780915549\javaLearn\day17
                D:/java/sharelink0-540460780915549/javaLearn/day17
        *
        * */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); //路径分隔符 windows：分号 linux: 冒号

        System.out.println(File.separator);//文件名称分隔符 windows:反斜杠 linux:正斜杠
    }
}

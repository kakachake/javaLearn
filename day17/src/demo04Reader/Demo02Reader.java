package demo04Reader;

/*
* java.io.Reader:字符输入流的最顶层的父类，定义了一些共性的成员方法，是一个抽象类
*
* 共性的成员方法：
*   int read():读取单个字符并返回
*   int read(char[] cbuf)一次读取多个字符，将字符读入数组
*   void close()
          关闭该流并释放与之关联的所有资源。

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader：文件字符输入流
    作用：将硬盘文件中的数据以字符的方式读入内存中

    构造方法：
        FileReader(File file)
          在给定从中读取数据的 File 的情况下创建一个新 FileReader。
        FileReader(String fileName)
          在给定从中读取数据的文件名的情况下创建一个新 FileReader。
        参数：读取文件的数据源
            String fileName: 文件路径
            File file: 一个文件
        作用：
            1.创建一个FileReader对象
            2.会把FileReader指向我们要读取的文件
    字符输入流的使用步骤：
        1.创建一个FileReader对象，构造方法绑定要读取的数据源
        2.使用FileReader对象中的方法read读取文件
        3.释放资源
* */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Demo02Reader {

    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\c.txt");
        //2.使用FileReader对象中的方法read读取文件
        //int read()读取某个字符并返回。
//        int len = fr.read();
//        while(len!=-1){
//            System.out.print((char)len);
//            len=fr.read();
//        }
        //int read(char[] cbuf)一次读取多个字符，将字符读入数组。
        char[] cs = new char[1024];//存储读取到多个字符
        int len = fr.read(cs);
        while(len!=-1){
            /*
            * String类的构造方法：
            * String(char[] value) 把字符数组转换为字符串
            * String(char[] value, int offset, int count) 把字符串数组的一部分转换为字符串
            * offset数组的开始索引 count转换的个数
            * */
            System.out.println(len);
            System.out.print(new String(cs, 0, len));
            len=fr.read(cs);
        }

        fr.close();
    }
}

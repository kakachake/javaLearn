package demo03IO;

/*
* java.io.InputStream:字节输入流
* 此抽象类表示字节输入流的所有类的超类
*
* 定义了所有子类共性的方法
* abstract  int read()
          从输入流中读取数据的下一个字节。
 int read(byte[] b)
          从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 int read(byte[] b, int off, int len)
          将输入流中最多 len 个数据字节读入 byte 数组。

 java.io.FileInputStream extends InputStream
    文件字节输入流
    作用：把硬盘文件中的数据读取到内存中使用

    构造方法：
        FileInputStream(File file)
                  通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
        FileInputStream(String name)
                  通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
             参数：文件的路径或者文件
             作用：1.会创建一个FileInputStream对象
                   2.会把FileInputStream对象指定构造方法中要读取的文件
    读取数据的原理(硬盘-->内存)
        java程序-->JVM-->os-->os读取数据的方法-->读取文件

    字节输入流的使用步骤：
        1.创建FileInputStream对象，构造法中绑定要读取的数据源
        2.使用FileInputSteam对象中的方法read,读取文件
        3.释放资源
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo04InputStream {
    public static void main(String[] args) {
        //1.创建FileInputStream对象，构造法中绑定要读取的数据源
        try {
            byte[] b = new byte[]{};
            FileInputStream fis = new FileInputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\c.txt");
            //int read()读取文件中的一个字节并返回，读取到文件末尾返回-1
            int len = fis.read();
            while(len != -1){
                System.out.println(len);
                len = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

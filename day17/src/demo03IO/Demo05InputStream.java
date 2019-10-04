package demo03IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
* 字节输入流一次读取多个字节的方法
*       int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
* 明确两件事情：
*       1.方法的参数byte[]的作用？
*           起到缓冲作用，储存每次读取到的多个字节
*           数组的长度一般定义为1024(1kb)或者1024的整数倍
*       2.方法的返回值int是什么
*           每次读取的有效字节个数
* String (byte[] bytes):把字节数组转换为字符串
* String(byte[] bytes, int offset, int length)
          通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
* */
public class Demo05InputStream {
    public static void main(String[] args) {
        //1.创建FileInputStream对象，构造法中绑定要读取的数据源
        try {
            FileInputStream fis = new FileInputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\c.txt");
            //使用FileInputStream对象中的方法read读取文件
            //int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
            byte[] bytes = new byte[1024];
            int len = fis.read(bytes);
            System.out.println(len);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

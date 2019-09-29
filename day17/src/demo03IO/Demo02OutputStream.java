package demo03IO;

/*
* 一次写多个字节的方法：
*    void write(byte[] b)
          将 b.length 个字节从指定 byte 数组写入此文件输出流中。
     void write(byte[] b, int off, int len)
          将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。

* */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个fileOutputStream对象，构造方法中传入写入数据的目的地
        FileOutputStream fos = new FileOutputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\b.txt");
        //2.调用FileOutputStream对象的方法write,把数据写入到文件中
        //调用FileOutputStream对象的方法write,把数据写入到文件中

        /*
        * void write(byte[] b)
            将 b.length 个字节从指定 byte 数组写入此文件输出流中。
          一次写多个字节：
            如果写第一个字节是整数，那么显示的时候会查询ASCII表
            如果写的第一个字节是负数，那么第一个字节和第二个字节组成一个中文显示，查询系统默认码表
        * */
        //byte[] b = {65, 66, 67, 68};

        //可以使用String类中的方法getBytes()来将字符串转换为byte数组
        byte [] bt = "张泰民".getBytes();
        System.out.println(Arrays.toString(bt));
        byte[] b = {-27, -68, -96, -26, -77, -80, -26, -80, -111};
        fos.write(b);
        fos.write("\n".getBytes());

        /*
        * void write(byte[] b, int off, int len)
            将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
        * */
        fos.write(b, 3, 6);
    }
}

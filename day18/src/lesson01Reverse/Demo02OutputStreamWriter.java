package lesson01Reverse;

import java.io.*;

/*
* java.io.OutputStreamWriter extends Writer
* OutputStreamWriter:是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节。
*
* 继承自父类的成员方法
*
* 构造方法：
*       OutputStreamWriter(OutputStream out)
          创建使用默认字符编码的 OutputStreamWriter。
        OutputStreamWriter(OutputStream out, String charsetName)
          创建使用指定字符集的 OutputStreamWriter。

          OutputStream out: 字节输出流，可以用来写转换之后的字节到文件中
          charsetName: 指定编码表的名称，不区分大小写，不指定为UTF-8
  使用步骤：
        1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定编码名称
        2.使用OutputStreamWriter对象中的方法writer，把字符转换为字节存储缓冲区（编码）
        3.使用OutputStreamWriter对象中的方法flush,把内容缓冲区的字节刷新到文件中
        4.释放资源
* */
public class Demo02OutputStreamWriter {

    public static void main(String[] args) throws IOException {
        write_utf_8();
        gbk();
        read_write_utf_8();
        read_gbk();
        utf_8_To_gbk();
    }

    private static void utf_8_To_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf-8_To_gbk.txt"), "gbk");
        char[] ch = new char[1024];
        int len;
        while((len = isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "gbk");
        char[] ch = new char[1024];
        isr.read(ch);
        isr.close();
        System.out.println(ch);
    }

    private static void read_write_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8");
        char[] ch = new char[1024];
        isr.read(ch);
        isr.close();
        System.out.println(ch);
    }

    /*
     * 使用转换流OutputStreamWriter写gbk格式文件
     * */
    private static void gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");
        osw.write("这是一个gbk编码的文件");
        osw.close();
    }

    /*
    * 使用转换流OutputStreamWriter写utf-8格式文件
    * */
    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf-8.txt"), "utf-8");
        osw.write("这是一个utf-8编码的文件");
        osw.close();
    }
}

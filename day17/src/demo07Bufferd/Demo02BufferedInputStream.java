package demo07Bufferd;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* java.io.BufferedInputStream extends InputStream
*
* BufferedInputStream:字节缓冲输入流
*
* 继承父类的成员方法：
*   abstract  int read()
          从输入流中读取数据的下一个字节。
    int read(byte[] b)
          从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
    int read(byte[] b, int off, int len)
          将输入流中最多 len 个数据字节读入 byte 数组。

  BufferedInputStream(InputStream in)
          创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
  BufferedInputStream(InputStream in, int size)
          创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
  参数：
    InputStream in: 字节输入流
        我们可以传递InputStream,缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的读取效率
    int size: 指定缓冲流内部缓冲区的大小，不指定默认
  使用步骤：
    1.创建一个FileInputStream,构造方法绑定读取的数据源
    2.创建一个BufferedInputStream对象，构造方法传递FileInputStream对象
    3.使用BufferedInputStream对象中的方法read读取文件
    4.释放资源
* */
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =  new FileInputStream("a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] b = new byte[1024];
        int len;
        while((len = bis.read(b)) != -1){
            System.out.println(new String(b, 0 , len));
        };

        bis.close();
    }
}

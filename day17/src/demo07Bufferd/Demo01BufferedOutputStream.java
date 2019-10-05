package demo07Bufferd;


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* java.io.BufferedOutputStream
* BufferedOutputStream: 字节缓冲输出流
*
* 继承父类的共性成员方法：
*   close()
*   flush()
*   write(byte[] b)
*   write(byte[] b, int off, int len)
*   write(int b)
*
* 构造方法：
*   BufferedOutputStream(OutputStream out)
          创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
    BufferedOutputStream(OutputStream out, int size)
          创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。
    参数：
        OutputStream out: 字节输出流
            我们可以传递FileOutputStream,缓冲流会给FileOutputStream增加一个缓冲区，提高写入效率
        int size: 指定缓冲流默认缓冲区的大小，不指定是默认
    使用步骤（重点）
        1.创建一个FileOutputStream对象，构造方法中绑定要输出的目的地
        2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象
        3.使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
        4.使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据刷新到文件中
        5.释放资源（会先调用flush方法刷新数据）

* */
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        fos.write("张泰民".getBytes());
        fos.close();
    }
}

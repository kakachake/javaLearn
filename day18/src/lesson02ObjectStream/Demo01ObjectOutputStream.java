package lesson02ObjectStream;


/*
* java.io.ObjectOutputStream extend OutputStream
*
* 作用：
*     把对象以流的方式写入到文件中保存
*
*   ObjectOutputStream(OutputStream out)
          创建写入指定 OutputStream 的 ObjectOutputStream。

    构造方法：
        ObjectOutputStream(OutputStream out) 创建指定OutputStream的ObjectOutputStram
        参数:
            OutputStream out: 字节输出流
    特有成员方法：
        void writeObject(Object obj)
          将指定的对象写入 ObjectOutputStream。
    使用步骤：
        1.创建一个ObjectOutputStream对象，构造方法中传递字节输出流
        2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
        3.释放资源
* */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day18\\a.txt"));
        Person p = new Person("张三", 19);
        oos.writeObject(p);
        System.out.println(p);
        oos.close();
    }
}

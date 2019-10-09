package lesson02ObjectStream;

/*
* java.io.ObjectInputStream extends InputStream
* ObjectInputStream: 对象的反序列化流
* 作用：把文件中保存的对象，以流的方式读取出来使用
*
* 构造方法:
*     ObjectInputStream(InputStream in)
          创建从指定 InputStream 读取的 ObjectInputStream。
      Object readObject()
          从 ObjectInputStream 读取对象。

  反序列化前提：
    1.类必须实现Serializable
    2.必须存在类对应的class文件
* */

import java.io.*;

public class Demo02ObjectInputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day18\\a.txt"));
        Object p = ois.readObject();
        System.out.println(p);
        System.out.println(((Person) p).getName()+((Person) p).getAge());
    }
}

package lesson02ObjectStream;

/*
* 练习：序列化集合
*       当我们想在文件中保存多个对象的时候
*       我们可以把对象存在一个集合中
*       对集合进行序列化或反序列化
* 分析：定义一个存储
* */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo03Test {

    public static void main(String[] args) throws IOException {
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(new Person("张三",19));
        arr.add(new Person("李四", 19));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day18\\b.txt"));
        oos.writeObject(arr);
        oos.close();
    }
}

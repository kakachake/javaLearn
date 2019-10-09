package lesson03PrintStream;

/*
* java.io.PrintStream extends OutputStream：打印流
*       PrintStream为其他输出添加了功能，是他们能方便的打印各种数值表示形式
*  PrintStream特点
*       1.只负责数据的输出，不负责数据的读取
*       2.与其他输出流不同，PrintStream 永远不会抛出 IOException；
*       3.有特有的方法，print、println方法(任意类型的值)
*
* 构造方法：
*   PrintStream(File file):输出的目的地是一个文件
*   PrintStream(OutputStream out)：输出的目的地是一个字节输出流
*   PrintStream(String fileName)：是一个文件路径
* 注意：
*   如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表
*   如果使用print/println方法，写的数据原样输出
* */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {

    public static void main(String[] args) throws FileNotFoundException {

        //创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("day18/print.txt");
        //如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表
        ps.write(97);
        ps.println(97);
        ps.close();
    }
}

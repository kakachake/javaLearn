package lesson03PrintStream;

/*
* 可以改变输出语句的目的地（打印流的流向）
* 输出语句，默认在控制台输出
* 使用System.setOut方法改变输出语句的目的地为参数传递的打印流的目的地
*       static void setOut(PrintStream out)
*           重新分配“标准”输出流。
* */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是控制台输出的");

        System.setOut(new PrintStream("day18/print2.txt")); //改变打印流的目的地
        System.out.println("我是改变后的");
    }
}

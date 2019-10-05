package demo07Bufferd;

import java.io.*;

/*
* java.io.BufferedInputStream extends Writer
* Buffered Writer:字符缓冲输出流
*
* 继承自父类的共性成员方法：
*   -void write(int c) 写入单个字符
*   -void write(char[] cbuf) 写入字符数组
*   -void write(char[] cbuf, int off, int len) 写入字符数组的一部分
*   -void write(String str)
*   -void write(String str, int off , int len)
*
* 构造方法：
*       BufferedWriter(Writer out)
          创建一个使用默认大小输出缓冲区的缓冲字符输出流。
        BufferedWriter(Writer out, int sz)
          创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
        参数：
            Writer out: 字符输出流
                我们可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高写入效率
            int sz:指定缓冲区的大小，不写默认大小
  特有的成员方法：
    void newLine()写入一个分隔符，会根据不同的操作系统，获取不同的行分隔符。
  使用步骤：
    1.创建字符缓冲输出流对象，构造方法中传递字符输出流
    2.调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
    3.调用字符缓冲输出流中的方法flush,把内存缓冲区的数据，刷新到文件中
    4.释放资源
* */
public class Demo04BufferedWriter {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("张泰民");
            bw.newLine();
        }
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        String res;
        while((res = br.readLine())!=null) {
            System.out.println(res);
        }
    }
}

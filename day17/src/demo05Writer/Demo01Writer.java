package demo05Writer;

/*
* java.io.writer:字符输出流，是所有字符输出流的最顶层父类，是一个抽象类
* 共性的成员方法：
*   Writer append(char c)
          将指定字符添加到此 writer。
 Writer append(CharSequence csq)
          将指定字符序列添加到此 writer。
 Writer append(CharSequence csq, int start, int end)
          将指定字符序列的子序列添加到此 writer.Appendable。
abstract  void close()
          关闭此流，但要先刷新它。
abstract  void flush()
          刷新该流的缓冲。
 void write(char[] cbuf)
          写入字符数组。
abstract  void write(char[] cbuf, int off, int len)
          写入字符数组的某一部分。
 void write(int c)
          写入单个字符。
 void write(String str)
          写入字符串。
 void write(String str, int off, int len)
          写入字符串的某一部分。
    java.io.FileWriter extends OutputStreamWriter extends Writer
       FileWriter:文件字符输出流
       作用：把内存中的字符数据写入到文件中

       构造方法：
           FileWriter(File file)
                根据给定的 File 对象构造一个 FileWriter 对象。
           FileWriter(String fileName)
                根据给定的文件名构造一个 FileWriter 对象。
        作用：
            1.会创建一个FileReader对象。
            2.会根据构造方法传递的文件/文件的路径，创建文件
            3.会把FileWriter对象指向创建好的文件。
    字符输出流的使用步骤（重点）：
        1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
        3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
        4.释放资源（会把内存缓冲区的数据刷新到文件中）
* */


import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\c.txt");
        //2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
        fw.write(97);
        fw.write("写入数据");
        //3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
        fw.flush();
        //4.释放资源（会先把内存中缓冲区中的数据刷新到文件中）
        fw.write("\n释放资源");
        fw.close();
    }
}

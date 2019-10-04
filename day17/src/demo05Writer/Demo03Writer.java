package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
* 字符输出流写数据的其他方法：
*   void write(char[] cbuf) 写入字符数组。
    abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len
写的字符个数。
    void write(String str) 写入字符串。
    void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个
数。

* */
public class Demo03Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\d.txt");
        char[] cs = {'张','泰','民'};
        fw.write(cs);
        fw.write("\n");
        fw.write(cs, 1,2);
        fw.write("\n");
        fw.write("张泰民", 1, 2);
        fw.flush();
    }
}

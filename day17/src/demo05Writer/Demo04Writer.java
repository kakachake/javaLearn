package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
* 续写和换行
* 续写：追加写：使用两个参数的构造方法。
* FileWriter(String fileName, boolean append)
          根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象
          append:续写开关，true:不会创建新的文件覆盖原文件，可以续写，false:创建新文件覆盖原文件
      换行：换行符号：
            windows:\r\n
* */
public class Demo04Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\d.txt", true);
        fw.write("\r追加内容3");
        fw.close();

    }
}

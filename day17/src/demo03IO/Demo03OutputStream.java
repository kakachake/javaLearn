package demo03IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 追加写/续写：使用两个参数的构造方法
*
* FileOutputStream(File file, boolean append)
          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
  FileOutputStream(String name, boolean append)
          创建一个向具有指定 name 的文件中写入数据的输出文件流。
    参数：
        string name:, File file: 写入数据的目的地
        boolean append：是否追加写数据
            true:不会覆盖原文件，会追加写
            false:创建一个新文件覆盖原文件
    写换行： 写换行符：
        windows: \r\n
        linux: /n
        max: /r
* */
public class Demo03OutputStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\c.txt", true);
        fos.write("\n这是新增的\n".getBytes());
        for (int i = 0; i < 10; i++) {
            fos.write("你好\r\n".getBytes());
        }
    }
}

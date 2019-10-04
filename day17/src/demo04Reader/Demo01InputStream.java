package demo04Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 使用字节流读取中文文件
* 1个中文：
*   GBK：占用两个字节
*   UTF-8：占用三个字节
* */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\c.txt");
        int len = fis.read();
        while(len != -1){
            System.out.println(len);
            len = fis.read();
        }
        fis.close();
    }
}

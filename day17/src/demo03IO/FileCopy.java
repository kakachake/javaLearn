package demo03IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\1_8_4_12_练习_文件复制.avi");
        //2。创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\Copy.avi");
        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = fis.read(bytes);
        while(len != -1){
            fos.write(bytes,0,len);
            len = fis.read(bytes);
        }
        //释放资源
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("共耗时"+(e-s)+"ms");
    }
}

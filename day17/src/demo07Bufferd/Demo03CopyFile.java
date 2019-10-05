package demo07Bufferd;

import java.io.*;

public class Demo03CopyFile {

    public static void main(String[] args) throws IOException {
        demo00(); //基本流+数组
        demo01(); //缓冲流+数组
        demo02(); //缓冲流
    }

    private static void demo00() throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\1_8_7_07_练习_对文本的内容进行排序.avi");
        FileOutputStream fos = new FileOutputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\copy.avi");
        byte[] b = new byte[1024];
        int len ;
        while((len = fis.read(b))!=-1){
            fos.write(b, 0, len);
        }
        fis.close();
        fos.close();
        System.out.println("共花费"+(System.currentTimeMillis()-s)+"ms");
    }

    private static void demo02() throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\1_8_7_07_练习_对文本的内容进行排序.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\copy.avi"));
        int len ;
        while((len = bis.read())!=-1){
            bos.write(len);
        }
        bis.close();
        bos.close();
        System.out.println("共花费"+(System.currentTimeMillis()-s)+"ms");
    }

    private static void demo01() throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\1_8_7_07_练习_对文本的内容进行排序.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\copy.avi"));
        byte[] b = new byte[1024];
        int len ;
        while((len = bis.read(b))!=-1){
            bos.write(b, 0, len);
        }
        bis.close();
        bos.close();
        System.out.println("共花费"+(System.currentTimeMillis()-s)+"ms");
    }
}

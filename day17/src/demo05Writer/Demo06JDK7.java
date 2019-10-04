package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
* JDK7的新特性
*   在try的后面可以增加一个()，在括号中可以定义流对象
*   那么这个流对象的作用域就在try中有效
*   try中的代码执行完毕会自动把流对象释放，不用写finally
*   格式：
*       try(){
*
*       }
* */
public class Demo06JDK7 {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\d.txt", true)) {
            for (int i = 0; i < 10; i++) {
                fw.write("hello world\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
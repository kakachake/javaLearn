package demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
* 在jdk1.7之前，我们可以使用try catch finally处理流中的异常
* 格式：
*   try{
*       可能会产生异常的代码
*   }catch(异常类变量 变量名){
*       异常的处理逻辑
*   }finnaly{
*       一定会执行的代码
*       资源释放
*   }
* */
public class Demo05TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域，让finally可以使用
        //变量在定义的时候可以没有值，但是使用的时候必须有值
        //fw = new FileWriter();执行失败， fw没有值，fw.close会报错
        FileWriter fw = null;
        try{
            fw = new FileWriter("D:\\java\\sharelink0-540460780915549\\黑马57\\01 语言基础+高级\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\d.txt", true);
            for(int i = 0; i < 10; i++){
                fw.write("hello world\n");
            }
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            //一定会指定的代码
            //创建失败了，fw的默认值是null，null是不能调用方法的，会抛出空指针异常
            //我们需要判断fw是否为空
            try {
                //fw.close方法声明抛出了IOException异常对象，需要trycatch捕获或者throws
                if(fw!=null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

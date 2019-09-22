package lesson01Debug;

/*
* finally代码块
*   格式：
*       try{
*
*       }catch(){
*
*       }finally{
*           无论是否出现异常都会执行
*       }
*
*  注意：
*       1.finally不能单独使用，必须和try一起使用
*       2.finally一般用于资源释放，无论程序是否出现异常，最后资源释放
*
* */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo04finally {
    public static void main(String[] args) {
        try{
            readFile("aa");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("这是最终执行的代码");
        }

    }

    /*
     * 定义一个方法，对传递的文件路径进行合法性的判断
     * 如果路径不是“C:\\a.txt”,那么我们就抛出文件找不到异常对象，告知方法的调用者
     * 注意：
     *       FileNotFoundException是编译异常，抛出了编译异常，就必须处理这个异常
     *       可以使用throws继续声明抛出FileNotFoundException这个异常对象让方法调
     *       用者处理。
     * */

    public static void readFile(String fileName) throws IOException {
        if(!fileName.equals("C:\\\\a.txt")){
            throw new FileNotFoundException("传递的文件不符合");
        }

        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名异常");
        }
    }
}

package lesson01Debug;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/*
* throws关键字：异常处理的第一种方式，交给别人处理
* 作用：
*     当方法内部抛出异常对象的时候，我们就必须处理这个对象
*     可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理,
*     最终交给JVM处理-->中断处理
* 使用格式：在方法声明时使用
*       修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException{
*           throw new AAAException("产生原因");
*           throw new BBBException("产生原因");
*       }
*       注意:
*           1.throws关键字必须写在方法声明处
*           2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
*           3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
*                如果抛出的多个异常对象有字父类关系，那么直接声明父类异常即可
*           4.调用了一个声明抛出异常的方法，我们就必须处理声明的异常
*                   要么继续使用throws声明抛出，交给方法的调用者处理，最终交给
*                   JVM处理
*                   要么try...catch处理
* */
public class Demo03Throws {

    public static void main(String[] args) {
        try{
            readFile("aa");
        }catch (Exception e){
            System.out.println(e);

            /*
            * Throwable类中定义了三个异常处理的方法
            * getMessage()
                返回此 throwable 的简短描述。
              toString()
                返回此 throwable 的详细消息字符串。
              printStackTrace()
                将此 throwable 及其追踪输出至标准错误流。
                JVM打印异常对象默认调用此方法，打印的异常信息是最全面的
            * */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
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

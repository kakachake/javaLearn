package Demo01Exception;

/*
* java.lang.Throwable：类是Java 语言中所有错误或异常的超类。
*       Exception:编译器异常，进行编译（写代码）Java程序出现的问题
*       RuntimeException:运行期异常，java程序运行过程中出现的问题
*       Error:错误
*           错误就相当于程序一个无法处理的错误
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) {
        //Exception:编译器异常，进行编译（写代码）Java程序出现的问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
        try {
            Date date = sdf.parse("2999-12-08");
        }catch (ParseException e){
            System.out.println(e);
        }

        //RuntimeException:运行期异常，java程序运行过程中出现的问题
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }

        /*
        * Error：错误
        * */

        int[] arr2 = new int[1024*1024*1024];
        //必须修改代码，创建的数组小一点

        System.out.println("后续代码");
    }
}

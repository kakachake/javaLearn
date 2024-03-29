package DemoMyException;
/*
* 自定义异常类：
*       java提供的异常类，不够我们使用，需要自己定义一些异常类
*  格式：
*       public class xxxException extends Exception | RuntimeException{
*           添加一个空参数构造
*           添加一个带异常信息的构造方法
*       }
*       注意：
*           1.自定义异常类一般都是以Exception结尾，说明该类时一个异常类
*           2.自定义异常类，必须得继承Exception或者RuntimeException
*               1.继承Exception,那么自定义的异常类就是编译器异常，如果方法内部抛出了编译期
*               异常就必须处理这个异常，要么throws,要么try...catch
*               2.继承RuntimeException:那么自定义的异常类就是一个运行期异常，无需处理，交给虚拟机处理（中断处理）
* */

public class RegisterException extends Exception{

    public RegisterException() {

    }

    /*
    * 添加一个带异常信息的构造方法
    * 查看源码发现：所有的异常类都会有一个带异常信息的构造方法，方法内部会调用父类异常信息的构造
    * 方法，让父类来处理这个异常信息
    * */
    public RegisterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public RegisterException(String message) {
        super(message);
    }
}

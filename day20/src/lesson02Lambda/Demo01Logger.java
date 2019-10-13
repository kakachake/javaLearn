package lesson02Lambda;

/*
* 日志案例
*
* 发现以下代码存在着一些性能浪费的问题
* 调用shouLog方法传递的第二个参数是一个拼接后的字符串
* 先把字符串拼接好，然后再调用showLog方法
* showLog方法如果传递的日志等级不大于一级，就不会输出拼接后的字符串
* 所以字符串就白白拼接了
* 存在浪费
* */

public class Demo01Logger {
    //定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level, String message){
        if(level>1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        showLog(2,msg1+msg2);
    }
}

package lesson02Lambda;

/*
* 使用lambda优化日志案例
* lambda的特点：延迟加载
*   lambda的使用前提：
*       必须存在函数式接口
* */
public class Demo02Lambda {
    //定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level, MessageBuilder mb){
        if(level>1){
            System.out.println(mb.concat());
        }
    }

    /*
    * 使用Lambda表达式作为参数传递，仅仅是把参数传递到showLog方法中
    * 只有满足条件，才会调用接口MessageBuilder的concat方法
    * */
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        showLog(2,()->{
            return msg1+msg2;
        });

    }
}

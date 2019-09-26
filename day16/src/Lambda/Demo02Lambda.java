package Lambda;

/*
* lambda表达式的标准格式：
*   由三部分组成：
*       a.一些参数
*       b.一个箭头
*       c.一段代码
*     格式：
*          (参数列表)->{一些重写方法的代码};
*
*     解释说明格式：
*       ():接口中抽象方法的参数列表，没有参数就空着，有就写出参数，多个参数使用
*       逗号分隔
*       ->:把参数传递给方法体
*       {}:重写接口的抽象方法体
* */

public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类实现多线程
        new Thread(){
            @Override
            public void run() {
                System.out.println("匿名线程");
            }
        }.start();

        //使用lambda表达式实现多线程
        new Thread(()->{
            System.out.println("lambda匿名线程");
        }).start();
    }
}

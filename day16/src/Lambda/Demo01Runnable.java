package Lambda;

/*
* 使用实现Runnable接口的方式实现多线程程序
* */

public class Demo01Runnable {

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        Runnable run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runable接口的实现类并调用
        new Thread(run).start();
        new Thread(){
            @Override
            public void run() {
                System.out.println("匿名线程");
            }
        }.start();
    }
}

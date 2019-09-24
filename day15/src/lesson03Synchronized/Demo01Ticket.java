package lesson03Synchronized;

/*
* 模拟卖票案例
* 创建三个线程，同时开启对共享的票进行出售
* */

public class Demo01Ticket {

    public static void main(String[] args) {
        //创建Runnable接口实现类对象
        RunableImpl run = new RunableImpl();
        //创建Thread类对象，构造方法中传递Runable接口实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start开启线程
        t0.start();
        t1.start();
        t2.start();
    }
}

package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 线程池：jdk1.5之后提供的
* java.util.concurrent.Executors：线程池的工厂类，用来生产线程池
* Executors有一个静态方法
* newFixedThreadPool(int nThreads)
*   创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程
*   参数：
*       int nThreads: 创建线程池中包含的线程数量
*   返回值：
*       ExecutorService接口，返回的是ExecutorService接口的实现类对象
*       我们可以使用ExecutorService接口接收（面向接口编程）
*
* java.util.concurrent.ExecutorService:线程池接口
*       用来从线程池中获取线程，调用start方法，执行任务
*       submit(Runnable task)
          提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。
        关闭/销毁线程池的方法：
          shutdown()
          启动一次顺序关闭，执行以前提交的任务，但不接受新任务。
    线程池的使用步骤：
        1.使用线程池的工厂类Executors里提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        2.创建一个类，实现runnable接口，重写run方法设置线程任务
        3.调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程，执行run方法
        4.调用ExecutorService中的方法shutdown销毁线程池，但是（不建议执行）
* */
public class Demo01Thread {

    public static void main(String[] args) {
        //1.使用线程池的工厂类里提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService es= Executors.newFixedThreadPool(3);
        RunnableImpl task = new RunnableImpl();
        es.submit(task);
        es.submit(task);
        es.submit(task);
        es.submit(task);
        es.submit(task);
        es.submit(task);
        System.out.println(task.count);
        //调用shutdown方法摧毁线程池
        es.shutdown();


    }

}

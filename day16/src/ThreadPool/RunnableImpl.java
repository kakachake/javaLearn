package ThreadPool;

/*
* 2.创建一个类，实现runnable接口，重写run方法设置线程任务
* */

public class RunnableImpl implements Runnable{

    public int count = 0;

    @Override
    public void run() {

        count++;
        System.out.println(Thread.currentThread().getName()+"count:"+count);
    }
}

package Thread;

/*
* 顾客类是一个线程类：可以继承Thread
* 设置线程任务（run）:吃包子
* 对包子状态进行判断
* false:没有包子
*       顾客调用wait方法进入等待状态
* true:有包子
*       顾客吃包子
*       吃完包子将状态改为false
*       顾客唤醒包子线程，生产包子
* */

public class Guke extends Thread{
    //1.需要在成员位置创建一个包子变量
    private BaoZi bz;

    //2.使用带参数构造方法为包子变量赋值
    public Guke(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务(run)：吃包子
    @Override
    public void run() {
        //使用死循环让顾客一直吃包子
        while (true){
            //必须同时同步技术保证两个线程只能有一个执行
            synchronized (bz){
                //对包子的状态进行判断
                if(bz.state == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行的代码，吃包子
                System.out.println("顾客正在吃"+bz.pi+bz.xian);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.state = false;
                bz.notify();
            }
        }

    }
}

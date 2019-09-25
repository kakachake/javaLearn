package Thread;

/*
* 生产者：(包子铺)类：是一个线程类，可以继承Thread
* 设置线程任务（run）:生产包子
* 对包子状态进行判断
* true: 有包子
*       包子铺调用wait方法等待
* false: 没有包子
*       包子铺生产包子
*       交替生产两种包子
*           两种状态：（i%2==0）
*        包子铺生产好了包子
*        修改包子状态为true
*        唤醒顾客线程，让顾客吃包子
*
* 注意：
*       包子铺线程和顾客线程关系-->通信（互斥）
*       必须同时同步技术保证两个线程只能有一个在执行
*       锁对象必须保证唯一，可以使用包子对象作为锁对象
*           1.需要在成员位置创建一个包子变量
*           2.使用带参数构造方法为包子变量赋值
* */

public class Baozipu extends Thread{
    //1.需要在成员位置创建一个包子变量
    private BaoZi bz;

    //2.使用带参数构造方法为包子变量赋值
    public Baozipu(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务（run）：生产包子
    @Override
    public void run() {
        while(true){
            //定义一个变量
            int count = 0;
            //必须使用同步技术保证两个线程只有一个执行
            synchronized (bz){
                //对包子状态进行判断
                if(bz.state == true){
                    //包子铺调用wait方法
                    try {
                        bz.wait(); //必须使用锁对象进行调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行，包子铺生产包子
                //交替生产两种包子
                if(count % 2 == 0){
                    //生产第一种
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                }else{
                    bz.pi = "冰皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                System.out.println("正在做包子。。。");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(bz.xian+"包子做完了");
                bz.state = true;
                //唤醒胡可线程，让顾客吃包子
                bz.notify();
            }
        }
    }
}

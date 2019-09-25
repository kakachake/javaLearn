package lesson06Lock;

/*
* 实现买票案例出现了线程安全问题，
* 卖出了不存在的票和重复的票
*
* 解决线程安全问题的第三种方案：使用Lock锁
* java.util.concurrent.locks有一个lock接口
* lock接口中的方法
* lock()
          获取锁。
  unlock()
          释放锁。
  java.util.concurrent.locks.ReentrantLock

  使用步骤：
    1.在成员位置创建lock的实现类对象
    2.在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
    3.在可能出现安全问题的代码后调用lock接口中的方法unlock释放锁
* */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunableImpl implements Runnable{
    //定义一个多个线程共享的票
    private static int ticket = 200;

    //1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    //创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        //先判断票是否存在
        while(ticket>0){
            l.lock();
            try {
                if(ticket >0 ){
                    //提高安全问题出现的概率
                    //让程序睡眠下
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //票存在，卖票，ticket--

                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;
                }
            }catch (Exception e){
                System.out.println(e);
            }finally {
                l.unlock();//无论程序是否异常都会把锁释放
            }
        }
    }

}

package waitAndNotify;

/*
* 等待唤醒案例：线程之间的通信
*   创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，
*   放弃cpu执行，进入waiting（无限等待）状态
*   创建一个老板（生产者），花了五秒做包子，做好之后，调用notify方法唤醒顾客线程
*
*   注意：
*       顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
*       同步使用锁对象必须唯一
*       只有锁对象才能调用wait和notify方法
*
*   Object类中的方法
*       notify()
            唤醒在此对象监视器上等待的单个线程。
            会继续执行wait方法之后的方法
        wait()
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
* */



public class Demo01WaitAndNotify {

    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();

        Thread boss = new Thread(){
            @Override
            public void run() {
                while (true){
                    //睡眠两秒
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    //保证等待和唤醒的线程只能有一个执行，需要用同步技术
                    synchronized (obj){
                        System.out.println("两秒钟之后了，告知顾客做好了");
                        obj.notify();
                    }
                }
            }
        };

        boss.start();
        //创建一个顾客线程（消费者）
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要用同步技术
                while(true){
                    synchronized (obj){
                        System.out.println("告知老板要的包子的种类和数量");

                        //调用wait方法，放弃cpu执行，进入waiting状态
                        try{
                            obj.wait();
                            System.out.println("吃包子");
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();


    }
}

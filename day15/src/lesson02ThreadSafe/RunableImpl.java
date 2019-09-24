package lesson02ThreadSafe;

/*
* 实现买票案例
* */

public class RunableImpl implements Runnable{
    //定义一个多个线程共享的票
    private int ticket = 1;

    @Override
    public void run() {
        //先判断票是否存在
        while(ticket>0){
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
        }
    }
}

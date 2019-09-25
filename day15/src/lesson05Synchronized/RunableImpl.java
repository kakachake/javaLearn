package lesson05Synchronized;

/*
* 实现买票案例出现了线程安全问题，
* 卖出了不存在的票和重复的票
*
* 解决线程安全问题的第二种方案：
* 使用步骤：
*   1.把访问了共享数据的代码抽取出来放在一个方法中
*   2.在方法上添加一个修饰符synchronized修饰符
*
* 格式：定义方法的格式
*       修饰符 synchronized 返回值类型 方法名(参数列表){
*           可能会出现线程安全问题的代码（访问了共享数据的代码）
*       }
* */

public class RunableImpl implements Runnable{
    //定义一个多个线程共享的票
    private static int ticket = 200;

    //创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        //先判断票是否存在
        while(ticket>0){
            //同步代码块
            payTicketStatic();
        }
    }

    /*
    * 静态的同步方法
    * 锁对象不能是this，this是创建对象之后产生的，静态方法优先于对象
    * 静态方法的锁对象是本类的class属性-->class文件对象(反射)
    * */
    public static synchronized void payTicketStatic(){
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

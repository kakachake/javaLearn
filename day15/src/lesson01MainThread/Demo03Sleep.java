package lesson01MainThread;

/*
* public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停
* 毫秒数结束后，线程继续执行
* */

public class Demo03Sleep {

    public static void main(String[] args) throws InterruptedException {
        //模拟秒表
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

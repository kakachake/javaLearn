package lesson01MainThread;

//1.创建一个Thread的子类
/*
* 2.获取线程的名称
*    1.使用Thread类中的方法getName()
*    2.可以先获取到当前正在执行的线程，再使用线程中的方法getName()获取线程的名称
*       public static Thread currentThread()
*       返回对当前正在执行的线程对象的引用。
* 3.设置线程的名称
*       1.使用Thread类中的方法setName()
*           public final void setName(String name)
*           改变线程名称，使之与参数 name 相同。
*       2.创建一个带参数的构造方法，参数传递线程的名称，调用父类的带参构造方法，
*       把线程名称传递给父类，让父类给子线程起一个名字
 * */

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("run"+i+'\t'+getName());
            System.out.println(Thread.currentThread());
        }
    }
}

package lesson01MainThread;
/*
* 创建多线程程序的第二种方式，实现Runable接口
* java.lang.Runable接口
*   Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为 run 的无参数方法。
*   1、适合多个相同程序的线程去处理统一资源的情况，把相同线程代码和数据有效分离，体现了面向对象的思想

    2、可以避免java单继承带来的局限性

 使用：
    java.lang.Thread类的构造方法可以传递Runable实现类
        Thread(Runnable target)
          分配新的 Thread 对象。
        Thread(Runnable target, String name)
          分配新的 Thread 对象。
 步骤：
    1.创建一个Runnable接口的实现类
    2.在实现类中重写Runnable接口的run方法，设置线程任务
    3.创建一个Runnable接口的实现类对象
    4.创建一个Thread类对象，构造方法传递Runnable接口的实现类对象
    5.调用Thread的start方法，开启新线程执行run方法

 实现Runnable接口创建多个线程程序的好处：
     1.避免了单继承的局限性
        一个类只能继承一个类，一个类继承了Thread类就不能继承其他的类
        实现了Runnable接口，还可以继承其他的类，实现其他的接口
     2.增强了程序的扩展性，降低了程序的耦合性
        实现了Runnable接口的方式，把设置线程任务和开启新线程进行了分离
        实现类中，重写了run方法，用来设置线程任务
        创建Thread类对象，调用start方法用来开启新线程
* */
public class Demo04Runnable {
    public static void main(String[] args) {
        RunableImpl ra = new RunableImpl();
        Thread th = new Thread(ra);
        th.start();
    }
}

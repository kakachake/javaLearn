package lesson01MainThread;

/*
* 主线程：执行主方法的线程
*
* 单线程程序：java程序只有一个线程
* 执行从main方法开始，从上到下依次执行
* */

public class Demo01MainThead {

    public static void main(String[] args) {
        Person p1 = new Person("张三", 12);
        p1.run();
        System.out.println(0/0);
        Person p2 = new Person("李四", 13);
        p2.run();
    }
}

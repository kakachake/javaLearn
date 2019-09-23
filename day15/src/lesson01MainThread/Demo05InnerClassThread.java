package lesson01MainThread;

/*
* 匿名内部类方式实现线程的创建
*
* 匿名：没有名字
* 内部类：写在其它类内部的类
*
* 匿名内部类作用：简化代码
*   把子类继承父类，重写父类的方法，创建子类对象，合成一步完成
*   把实现类实现类接口，重写接口方法，创建实现类对象合成一步完成
* 匿名内部类是最终产物：子类/实现类对象，而这个类没有名字
*
* 格式：
*       new 父类/接口(){
*           重写父类/接口的方法
*       }
* */

public class Demo05InnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }.start();

        new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();
    }
}

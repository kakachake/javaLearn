package Thread;
/*
* 测试类：
*   包含main方法，程序执行的入口，启动程序
*   创建包子对象
* */

public class Main {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        new Baozipu(bz).start();
        new Guke(bz).start();
    }
}

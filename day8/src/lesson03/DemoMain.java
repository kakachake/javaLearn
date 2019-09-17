package lesson03;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        USB mouse = new Mouse();

        USB keyboard = new Keyboard();

        Keyboard keyboard1 = new Keyboard();

        computer.useDevice(mouse);

        computer.useDevice(keyboard);
        //方法参数是USB类型，传递进去的是实现类
        computer.useDevice(keyboard1); //正确写法，发生了向上转型
        computer.useDevice(new Keyboard()); //正确写法，发生了向上转型


        computer.powerOff();

    }

}

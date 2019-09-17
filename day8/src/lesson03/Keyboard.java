package lesson03;

public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    public void keyDown() {
        System.out.println("键盘输入");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
}

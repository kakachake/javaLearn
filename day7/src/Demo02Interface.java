

public class Demo02Interface {

    public static void main(String[] args) {

        // 创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodDefault();//调用抽象方法，实际运行的是右侧的实现类

        // 调用默认方法，如果实现类当中没有，会向上找接口

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodDefault();
    }

}

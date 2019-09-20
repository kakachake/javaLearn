package lesson04;

/*
* 测试含有泛型的接口
* */

public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl gi1 = new GenericInterfaceImpl();
        gi1.method("hello world");
    }
}

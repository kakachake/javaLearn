package lesson04;

/*
* 测试含有泛型的方法
* */

public class Demo03GenericMethod {

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();

        /*
        * 调用含有泛型的方法
        * */
        gm.method("hello world");
        gm.method(123);
        gm.method02("hello world");
        GenericMethod.method02("hello world");
    }
}

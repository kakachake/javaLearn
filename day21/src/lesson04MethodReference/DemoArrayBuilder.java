package lesson04MethodReference;

import java.lang.reflect.Array;

/*
* 数组的构造器引用
* */
public class DemoArrayBuilder {
    /*
     *定义一个方法
     * 方法的参数传递创建数组的长度和ArrayBuilder接口
     * 方法内部根据传递的长度使用ArrayBuilder创建数组并返回
     *
     * */
    public static int[] createArray(int len, ArrayBuilder ab){
        ab.builderArray(len);
    }

    public static void main(String[] args) {
        createArray(10, int[]::new);
    }
}

package lesson01Debug;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Debug调试程序
 *   可以让代码逐行执行，查看代码执行的过程，调试程序中出现的bug
 *
 *   使用方式：
 *      在行号的右边，鼠标左键单击，添加断点
 *
 *
 * */
public class Demo01Debug {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
        for (Integer integer : arr) {
            System.out.println(integer);
        }

        Iterator<Integer> in = arr.iterator();
        while(in.hasNext()){
            System.out.println(in.next());
        }

        print();
    }

    private static void print() {
        System.out.println(111);
    }
}

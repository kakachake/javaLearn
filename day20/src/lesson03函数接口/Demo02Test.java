package lesson03函数接口;

import java.util.function.Supplier;

/*
* 练习：求数组元素的最大值：
*       使用Supplier接口作为方法参数类型，通过Lambda表达式求出数组中的最大值
*       提示：接口的泛型请使用java.lang.Interger
* */
public class Demo02Test {
    //定义一个方法，用于获取数组中元素最大值，方法的参数传递Supplier接口，泛型使用Interger
    public static int getNum(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个int类型的数组并赋值
        int[] arr = {100, 0, -50, 88, 99, 33, -20};
        int mx = getNum(()->{
            //获取数组最大值
            //定义一个变量，把数组中的第一个元素赋值给该变量，记录数组中元素的
            int max = 0;
            for (int i : arr) {
                if(i>max)
                    max = i;
            }
            return max;
        });
        System.out.println(mx);
    }
}

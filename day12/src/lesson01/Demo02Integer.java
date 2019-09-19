package lesson01;

/*
* 自动装箱与自动装箱：基本类型的数据和包装类之间可以自动的相互转换
* JDK1.5之后出现的新特性
* */

import java.util.ArrayList;

public class Demo02Integer {

    public static void main(String[] args) {
        /*
        * 自动装箱:
        *   直接把int类型的整数赋值给包装类
        *   Integer i1 = 1;
        * */

        Integer i1 = 1;//相当于Integer i1 = new Integer(1);

        /*
        * 自动拆箱：
        *
        * */
        i1 = i1 + 2;//i1是包装类，不能直接参与运算，可以自动转换为基本数据类型
        System.out.println(i1);

        ArrayList<Integer> list = new ArrayList<>();
        /*
        * ArrayList无法直接存储整数，可以存储Integer包装类
        * */
        list.add(1);//自动装箱
        System.out.println(list.get(0));//自动拆箱
    }
}

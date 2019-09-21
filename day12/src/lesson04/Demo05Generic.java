package lesson04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 泛型通配符：
*       ?: 代表任意的数据类型
* 使用方式：
*       不能创建对象使用
*       只能作为方法的参数使用
* */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("1");
        list02.add("2");

        method(list01);
    }

    /*
    * 定义一个方法，能遍历所有类型的ArrayList集合
    * 这时候我们不知道ArrayList集合使用的什么数据类型，可以使用通配符?
    * */

    public static void method(ArrayList<?> list){
        Iterator<?> c1 = list.iterator();
        while(c1.hasNext()){
            System.out.println(c1.next());
        }
    }
}

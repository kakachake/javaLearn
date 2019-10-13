package lesson03Func;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

/*
* Stream流中的方法——count:用于统计Stream流中元素的个数
* Long count();
* count方法是一个终结方法，返回值是一个long类型的整数
* 所以不能继续调用Stream流中的其他方法了
* */
public class Demo04StreamCount {
    public static void main(String[] args) {
        //获取一个Stream流
        ArrayList<Integer> lst = new ArrayList<>();
        Collections.addAll(lst, 1, 2, 3, 4, 5, 6);
        Stream<Integer> stream = lst.stream();
        long count = stream.count(); //返回long类型的数据
        System.out.println(count);
    }
}

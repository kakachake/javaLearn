package lesson03Func;

/*
* 如果需要流中的元素映射到另一个流中，可以使用map方法：
* <R> Stream<R> map(Function<? super T,? extends R> mapper)
* 返回由给定函数应用于此流的元素的结果组成的流
*
* */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

public class Demo03StreamMap {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法，把字符串类型的整数转换为Interger类型
        Stream<Integer> stream1 = stream.map((item)->{
            return Integer.parseInt(item);
        });
        stream1.forEach((i)->{
            System.out.println(i);
        });
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(2);
        System.out.println(lst);
        HashSet<Integer> set = new HashSet<>(lst);
        System.out.println(set);
    }
}

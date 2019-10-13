package lesson02GetStream;

import java.util.*;
import java.util.stream.Stream;

/*
* java.util.stream.Stream<T>是java8新加入的最常用流接口
* 获取一个流非常简单，有以下几种常用的方式：
*   -所有的Collection集合都可以通过stream默认方法获取流
*   -strem接口的静态方法of可以获取数组对应的流
*       static <T> Stream<T> of (T...values)
*       参数是一个可变参数，那么我们就可以传递一个数组
* */
public class Demo01GetStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        Map<String, String> map = new HashMap<>();
        Set<String> keyset = map.keySet();
        Stream<String> stream2= keyset.stream();

        //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();
        
        //获取键值对(键与值的映射关系)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        //把数组转换为Strem流
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> arr1 = Stream.of(arr);



    }
}

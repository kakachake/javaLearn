package lesson03Func;

/*
* Stream流中常用方法——
* limit:用于截取流中的元素
*   Limit方法可以对流进行截取，只取用前n个
*   limit方法是一个延迟方法，能继续调用Stream流中的方法，只是对流中的元素进行截取
*   返回的是一个新的流，所以可以继续调用Stream流中的其他方法
*
* skip: 用于跳过指定个数个元素
*
*
* */

import java.util.stream.Stream;

public class Demo05StremLimit {
    public static void main(String[] args) {
        //获取一个Stream流
        Character[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        Stream<Character> arr1 = Stream.of(arr);
        arr1.limit(3).forEach((item)->{
            System.out.println(item);
        });
        Stream<Character> arr2 = Stream.of(arr);
        arr2.skip(3).forEach((item)->{
            System.out.println(item);
        });

    }
}

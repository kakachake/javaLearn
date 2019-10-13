package lesson03Func;

import java.util.stream.Stream;

/*
* concat:用于把流组合到一起
* 如果有两个流，希望合并为一个流，那么可以使用stream接口中的静态方法concat
* 必须为相同类型
* */
public class Demo06StreamConcat {
    public static void main(String[] args) {
        Character[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        Stream<Character> arr1 = Stream.of(arr);
        Stream<Character> arr2 = Stream.of('g', 'h', 'i');
        Stream<Character> arr3 = Stream.concat(arr1, arr2);
        arr3.forEach((item)->{
            System.out.println(item);
        });
    }
}

package lesson03Func;

import java.util.stream.Stream;

/*
 * Stream流中常用方法filter:用于对Stream流中的数据进行过滤
 * Stream<T> filter(Predicate<? super T> predicate);
 * filter方法的参数Predicate是一个函数式接口，所以可以传递Lambda表达式，
 * 对数据进行过滤
 * Predicate中的抽象方法：
 *   boolean test(T t);
 * */
public class Demo02StreamFilter {
    public static void main(String[] args) {
        //创建一个Strem流
        Stream<Character> arr = Stream.of('a', 'b', 'c');
        Stream<Character> arr2 = arr.filter((item)->{
            return item > 'b';
        });
        arr2.forEach((item)->{
            System.out.println(item);
        });

        /*
        * Stream属于管道流，只能被消费（使用）一次
        * 第一个Stream流调用完毕方法，数据就会流转到下一个Stream流上
        * 这时第一个Stream流就已经使用完毕，就会关闭了，就不能再调用了
        * */
        arr.forEach((item)->{
            System.out.println(item); //报错，已经被使用过
        });
    }
}

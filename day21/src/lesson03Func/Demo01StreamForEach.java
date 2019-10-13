package lesson03Func;

import java.util.stream.Stream;

/*
 * Stream流常用方法 forEach
 * void forEach(Consumer<? super T> action);
 * 该方法接收的是一个Consumer接口函数，会将每一个硫元素交给该函数处理
 * Consumer接口是一个消费型的函数式接口，可以传递lambda表达式，消费数据
 *
 * 简单记：
 *   forEach方法，用来遍历流中的数据
 *   是一个终结方法，遍历之后就不能继续调用Stream流中的其他方法
 * */
public class Demo01StreamForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五");
        stream.forEach((name)->{
            System.out.println(name);
        });
    }
}

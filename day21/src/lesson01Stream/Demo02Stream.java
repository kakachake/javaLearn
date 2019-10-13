package lesson01Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
*  使用Stream流的方式，遍历集合，对集合的数据进行遍历
*  Stream流是jdk1.8之后出现的
* */
public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        //对集合中的元素进行过滤
        Stream list2 = list.stream() //这里指定了Stream泛型为String
                .filter(name->name.startsWith("张"))
                .filter(name->name.length() == 2);
        System.out.println(Arrays.toString(list2.toArray()));
    }
}

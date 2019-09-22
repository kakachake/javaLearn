package lesson03;
/*
*
* 增强for循环，底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
* 是JDK1.5之后出现的新特性
* Collection<E>extends Iterable<E>：所有的单列集合都可以使用增强for
* public interface Iterable<T>实现这个接口允许对象称为“foreach”语句的目标
*
* 增强for循环就是用来遍历集合和数组
* 格式：
*   for(集合/数组数据类型 变量名: 集合名/数组名){
*       sout(变量名)
*   }
*
* 实际上：增强for循环就是简化了的Iterator的写法.
* 他们最终编译生成的代码是相同的
* */

import java.util.ArrayList;

public class Demo02For {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for(int a: arr){
            System.out.println(a);
        }

        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("world");
        al.add("java");
        for(String s: al){
            System.out.println(s);
        }
    }
}

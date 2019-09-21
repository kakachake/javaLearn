package lesson01;

/*
* java.util.Set接口 extends Collection接口
* Set接口特点：
*   1.不允许存储重复的元素
*   2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
*
* java.util.HashSet集合 implements Set接口
* HashSet特点：
*   1.不允许存储重复的元素
*   2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
*   3.是一个无序的集合，存储和取出元素的顺序有可能不一致
*   4.底层是一个哈希表结构，查询速度非常快
*
* */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo02Set {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(2);
        System.out.println(set);
        //使用迭代器遍历
        Iterator<Integer> in = set.iterator();
        while(in.hasNext()){
            System.out.println(in.next());
        }

        //使用增强for遍历
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}

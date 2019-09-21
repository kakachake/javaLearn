package lesson03Set;

/*
* java.util.LinkedHashSet集合 extends HashSet集合
* LinkedHashSet集合特点：
*       底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
*
* */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo03LinkedHashSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        System.out.println(set);//无序的，不允许重复

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("www");
        set2.add("abc");
        set2.add("abc");
        System.out.println(set2);//有序的，不允许重复
    }
}

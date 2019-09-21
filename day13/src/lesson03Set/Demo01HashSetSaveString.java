package lesson03Set;

/*
* Set集合不允许存储重复元素的原理
*
* */

import java.util.HashSet;

public class Demo01HashSetSaveString {

    public static void main(String[] args) {
        //创建一个HashSet集合
        HashSet<String> set = new HashSet<>();
        String s1 = new String("hello");
        String s2 = new String("hello");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("hello");
        /*
        * add方法会先计算s1的hashCode方法，计算字符串“hello”的哈希值
        * 在集合中找也没有对应哈希值的元素，发现没有，就会把s1存储到
        * 集合中
        * 然后计算s2的hashCode方法，计算得到"hello"的哈希值，
        * 发现有（哈希冲突），
        * s2会调用equals方法和哈希值相同的元素进行比较 s2.equals(s1),返回true
        * 两个元素的哈希值相同，equals方法返回true，就认定两个元素相同
        * */
        System.out.println(set);
    }
}

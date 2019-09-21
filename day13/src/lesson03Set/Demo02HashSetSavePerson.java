package lesson03Set;
/*
* 使用HashCode集合存储自定义元素
*
* Set集合保证元素唯一
*   存储的元素（String, Integer,...Student, Person）必须重写hashCode方法
*
*   要求：
*       同名同年龄的人，是为同一个人，只能存储一次
* */

import java.util.HashSet;

public class Demo02HashSetSavePerson {

    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);
        Person p3 = new Person("张三", 19);
        //p1和p2的哈希值不同
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}

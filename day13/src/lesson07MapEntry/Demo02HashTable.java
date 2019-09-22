package lesson07MapEntry;

/*
* java.util.HashTable<K,V>集合，implements Map<K,V>
*
*     HashTable底层也是一个哈希表，是一个线程安全的集合，是单线程的集合，速度慢
*     HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快
*     HashMao集合可以存储null值，null键
*     HashTable不能存储空值，空键
*
*     HashTable已经不再使用
*     但是其子类Properties依然活跃在历史舞台
*     Properties集合是一个唯一和IO流相结合的集合
* */

import java.util.HashMap;
import java.util.Hashtable;

public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);

        Hashtable<String, String> map2 = new Hashtable<>();
        map2.put(null, "a");
        map2.put("b", null);
        map2.put(null, null);
        System.out.println(map2);//报错
    }
}

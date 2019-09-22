package lesson07MapEntry;

/*
*  java.util.LinkedHashMap<K,V> entends HashMap<K,V>
*   Map接口的哈希表和链表实现，具有可预知的迭代顺序
*   底层原理：
*       哈希表+链表（记录元素的顺序）
*
* */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Demo03LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("d", "d");
        map.put("b", "b");
        map.put("a", "d"); //key不允许重复，无序：{a=d, b = b, c = c， d=d}
        System.out.println(map);
        LinkedHashMap<String, String> map2= new LinkedHashMap<>();
        map2.put("a", "a");
        map2.put("c", "c");
        map2.put("d", "d");
        map2.put("b", "b");
        map2.put("a", "d");
        System.out.println(map2); //不允许重复，有序
    }
}

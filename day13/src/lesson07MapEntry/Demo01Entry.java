package lesson07MapEntry;

/*
* Map.entry<K,V>在Map接口中有一个内部接口Entry
* 作用：当Map集合一创建，那么就会在Map集合中创建一个Entry对象，用来记录
* 健与值（键值对对象）
*
* Map集合遍历的第二种方式，使用Entry对象遍历
*
* 实现步骤：
*   1.使用Map集合中的方法entrySet(),把Map集合中的多个entry对象取出来，存到一个set集合中
*   2.遍历Set集合，获取每一个entry对象
*   3.使用Entry对象中的getKey获取键与值
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01Entry {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 15);
        map.put("李四", 16);
        map.put("王五", 17);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> o : set) {
            System.out.println(o);
            System.out.println(o.getKey());
            System.out.println(o.getValue());
        }
    }
}

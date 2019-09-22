package lesson06Map;

/*
* Map集合的第一种遍历方式：通过键找值的方式
* Map集合方法：
*   Set<K> keySet()返回此映射中包含的键的Set视图
* 实现步骤：
*   1.使用Map集合中的方法keySet(),把Map集合中的key取出来，存到一个set集合中
*   2.遍历Set集合，获取Map集合中的每一个key;
*   3.通过get方法，通过key找到value
*
* */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 15);
        map.put("李四", 16);
        map.put("王五", 17);

        //1.使用Map集合中的方法keySet(),把Map集合中的key取出来，存到一个set集合中
        Set<String> set = map.keySet();

        Iterator<String> in = set.iterator();
        while(in.hasNext()){
            String key = in.next();
            System.out.println(key + ':' + map.get(key));
        }
        System.out.println("========================");
        //增强for循环
        for (String s : set) {
            System.out.println(s+':'+map.get(s));
        }

        System.out.println("========================");
        //最终简化版
        for (String s : map.keySet()) {
            System.out.println(s+':'+map.get(s));
        }
    }
}

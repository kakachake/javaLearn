package lesson06Map;

/*
* java.util.Map(k,v)集合
* Map集合的特点：
*   1.Map集合是一个双列集合，一个元素包含两个值(key, value)
*   2.Map集合中的元素，key和value的数据类型可以相同也可以不同
*   3.Map集合中的元素，key是不允许重复的，value是可以重复的
*   4.Map集合中的元素，key和value是一一对应的
*
*   HashMap集合的特点：
*       1.底层是哈希表：查询速度特别快
* */

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {

    public static void main(String[] args) {
        //Map常用方法
        show01(); //put
        show02(); //remove
        show03(); //get
        show04(); //containsKey()判断集合中是否包含指定的键
    }

    /*
    *   boolean containsKey(Object key)包含返回true否则false
    * */
    private static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 15);
        map.put("李四", 16);
        map.put("王五", 17);
        System.out.println(map.containsKey("赵四")==true?"包含":"不包含");
    }

    private static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 15);
        map.put("李四", 16);
        map.put("王五", 17);
        System.out.println(map.get("张三"));
    }


    /*
    * public V remove(Object key): 把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值
    * 返回值： V
    *       key存在，V返回被删除的元素值
    *       key不存在，V返回空
    * */
    private static void show02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 15);
        map.put("李四", 16);
        map.put("王五", 17);
        System.out.println(map);
        Integer val = map.remove("李四");
        System.out.println(map);
        System.out.println(val);
        val = map.remove("李四");
        System.out.println(val);
    }

    /*
     * public V put (K key, V value):把指定的键与指定的值添加到Map集合中
     * 返回值：
     *      储存键值对的时候，key不重复，返回值V是null
     *      key重复，会使用新的value替换map中重复的value值，返回被替换的value值
     * */
    private static void show01() {
        //创建Map集合对象，多态
        Map<String, String> map = new HashMap<>();
        map.put("李晨","范冰冰");
        map.put("米饭","馒头");
        System.out.println(map.toString());
        String val = map.put("米饭","熟");
        System.out.println(val);
        System.out.println(map);
    }
}

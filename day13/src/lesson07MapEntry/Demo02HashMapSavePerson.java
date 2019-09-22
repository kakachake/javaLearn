package lesson07MapEntry;

/*
* HashMap存储自定义类型键值
* Map集合保证key是唯一的：
*   作为key的元素，必须重写hashCode方法和Equals方法,以保证key唯一
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02HashMapSavePerson {

    public static void main(String[] args) {
        show01();
        show02();

    }

    /*
    * HashMap存储自定义类型的键值
    * key:Person类型
    *     Person类型就必须重写hashCode方法和equals方法
    * value:String类型
    *      可以重复
    * */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("张三", 18), "上海");
        map.put(new Person("李四", 18), "北京");
        map.put(new Person("王五", 18), "广州");
        map.put(new Person("王五", 18), "深圳");
        //使用entrySet和增强for遍历Map集合
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry);
        }
    }


    /*
    * HashMap存储自定义类的建与值
    * key: String类型
    *       String类重写了hashCode和equals方法，可以保证key唯一
    * value: Person类型
    *       value可以重复（同名同年龄视为同一个）
    * */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
        //在集合中添加元素
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("广州", new Person("王五", 20));
        map.put("广州", new Person("赵六", 21));
        for (String s : map.keySet()) {
            System.out.println(s+":"+map.get(s));
        }
    }
}

package lesson06List;

/*
* java.util.List接口 extends Collection接口
* List接口特点：
*   1.有序的集合吗，存储元素和取出元素的顺序是一致的
*   2.有索引
*   3.允许存储重复元素
* List接口中带索引的方法
* add、 get、 remove、 set
* 注意：操作索引的时候一定要防止索引越界异常
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("world");
        System.out.println(list.get(0));
        list.remove(2);
        System.out.println(list.toString());
        list.set(1,"java");
        System.out.println(list.toString());

        //list集合遍历的三种方式
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //使用迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //使用增强for
        for (String s : list) {
            System.out.println(s);
        }

    }
}

package lesson05Collections;

/*
* java.util.Collections是集合工具类，用来对集合进行操作，部分方法如下
*
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo01Collections {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);

        //Collections.addAll()向集合中添加一些元素
        Collections.addAll(list, "f", "g", "h");
        System.out.println(list);

        //Collections.shuffle()打乱集合的顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}

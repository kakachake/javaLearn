package lesson05Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* 注意：
*   sort方法使用前提
*   被排序的集合元素必须实现Comparable,重写接口方法compareTo定义排序的规则
*
*   Comparator和Comparable区别
*   Comparable:自己和别人比较，重写compareTo方法
*   Comparator：相当于找一个第三方的裁判，比较两个
* */

public class Demo02Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);//默认升序

        //自定义排序规则--降序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("张三", 18));
        list1.add(new Person("李四", 20));
        list1.add(new Person("王五", 15));
        Collections.sort(list1);
        System.out.println(list1);
    }
}

package lesson03;

/*
*java.util.Iterator接口：迭代器（对集合进行遍历）
* 有两个常用方法：
* boolean hasNext()
          如果仍有元素可以迭代，则返回 true。
    E next()
          返回迭代的下一个元素。
  Iterator迭代器是一个接口，我们无法直接使用，需要使用接口的实现类对象，
  获取实现类的方式比较特殊，Collection接口中有一个方法叫做iterator(),这个
  方法返回的就是迭代器对象

  迭代器的使用步骤：
    1.使用集合中的方法（iterator()）获取迭代器的实现类对象，使用Iterator接口接收(多态)
    2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
    3.使用Iterator接口中的方法next()取出集合中的下一个元素
* */

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {

    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        Iterator<Integer> in = coll.iterator();
        while(in.hasNext()){
            System.out.println(in.next());
        }
        Iterator<Integer> in2 = coll.iterator();
        for(;in2.hasNext();){
            System.out.println(in2.next());
        }
    }
}

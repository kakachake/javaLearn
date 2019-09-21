package lesson01;

/*
* java.util.LinkedList集合 implements list接口
* 特点：
*   1.底层是一个链表结构：查询慢，增删快
*   2.里面包含大量操作首尾元素的方法
*   注意：使用LinkedList集合特有的方法，不能使用多态
*
*   public void addFirst(E e) :将指定元素插入此列表的开头。
    public void addLast(E e) :将指定元素添加到此列表的结尾。
    public void push(E e) :将元素推入此列表所表示的堆栈。
    public E getFirst() :返回此列表的第一个元素。
    public E getLast() :返回此列表的最后一个元素。
    public E removeFirst() :移除并返回此列表的第一个元素。
    public E removeLast() :移除并返回此列表的最后一个元素。
    public E pop() :从此列表所表示的堆栈处弹出一个元素。
    public boolean isEmpty() ：如果列表不包含元素，则返回true。

* */

import java.util.LinkedList;

public class Demo01LinkedList
{

    public static void main(String[] args) {
        show01();
    }

    private static void show01() {

        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list);
        list.addFirst("Wow!");
        list.addLast("Java!");
        list.push("learn");
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.clear();
        System.out.println(list.isEmpty());
    }
}

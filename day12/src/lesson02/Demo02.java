package lesson02;

import java.util.ArrayList;
import java.util.Collection;

/*
*
* java.util.Collection接口
*    所以单列集合的最顶层接口，里面定义了所以单列集合共性的方法
*    任意的单列集合都可以使用Collection接口中的方法
*
* 共性的方法：
- public boolean add(E e)`：  把给定的对象添加到当前集合中 。
- `public void clear()` :清空集合中所有的元素。
- `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
- `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
- `public boolean isEmpty()`: 判断当前集合是否为空。
- `public int size()`: 返回集合中元素的个数。
- `public Object[] toArray()`: 把集合中的元素，存储到数组中。
*
* */
public class Demo02 {

    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        /*
        * public boolean add(E e)：把给定的对象添加到当前的集合中
        * 返回值是一个布尔类型，一般都返回true,可以不接收
        * */
        coll.add("abc");
        coll.add("123");
        System.out.println(coll);//重写了toString方法
        
    }
}

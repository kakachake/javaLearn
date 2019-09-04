package lesson04;


/*
* ArrayList当中的常用方法
* 1. public boolean add(E e):向集合中添加元素，参数的类型和泛型一致
* 对于ArrayList集合来说，add动作一定是成功的，返回值可用可不用，但是对于其他集合，add
* 添加动作不一定成功
*
* 2. public E get(int index), 从集合中获取元素，参数是索引编号，返回值就是对应位置的元素
* 3. public E remove(int index), 从集合中删除元素，参数是索引编号，返回值就是被删除的元素
* 4. public int size(), 获取集合的尺寸长度，返回值是集合中包含的元素个数
* */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo03ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); //[]


        //向集合中添加元素: add
        System.out.println(list.add("古力娜扎"));

        list.add("高圆圆");
        list.add("赵又廷");

        System.out.println(list);

        //从集合中获取元素， get, 索引值从0开始
        System.out.println("第二号索引位置："+list.get(2));

        //从集合中删除元素，remove, 索引从0开始
        System.out.println("删除了："+list.remove(0));
        System.out.println(list);

        //长度
        System.out.println("长度为："+list.size());

        int[] arr = new int[3];
        System.out.println(arr.length);
        System.out.println(Array.getLength(arr));

        //遍历
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

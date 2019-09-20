package lesson04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {

    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
    * 创建集合对象，使用泛型
    * 好处:
    *      1.避免了类型转换的麻烦，存储的是什么类型，取出的是什么类型
    *      2.把运行期异常(代码运行之后会抛出的异常)，提升到了编译期(写代码的时候会报错)
    * 弊端：
    *      泛型是什么类型就只能存储什么类型的数据
    * */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    /*
    * 创建集合对象，不使用泛型
    * 好处：
    *     集合不使用泛型，默认类型就是Object类型，可以存储任意类型的数据
    * 弊端：
    *     不安全，会引起异常
    * */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(123);
        Iterator it = list.iterator();
        while(it.hasNext()){
            //取出的元素也是Object类型
            Object obj = it.next();
            System.out.println(obj);

            //想要String类特有的方法，length获取字符串的长度；
            //需要向下转型
            if(obj instanceof  String){
                String s = (String)obj;
                System.out.println(s.length());
            }
        }
    }


}

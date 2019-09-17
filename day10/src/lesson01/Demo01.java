package lesson01;

import java.util.ArrayList;

public class Demo01 {

    public static void main(String[] args) {

        /*
        * Person类继承了Object类，所以可以使用Object类的equals方法
        * boolean equals(Object obj)指示某个对象是否与此对象相等
        * 参数：
        *   Object obj: 可以传递任意的对象
        * */

        /*
        *
        * Object类的equals方法，默认比较的是两个对象的地址值，没有意义
        * 所以我们要重写equals方法，比较两个对象的属性（name, age）
        *
        * 问题：
        *     隐含着一个多态：
        *       多态的弊端：无法使用子类特有内容（属性和方法）
        *       Object obj = p2 = new Person("古力娜扎", 19);
        *       解决：可以使用向下转型（强转）把obj类型转换为Person
        * */


        Person person = new Person("张三", 10);
        System.out.println(person.toString());

        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("古力娜扎", 19);
        Person p3 = new Person("迪丽热巴", 18);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(p1.equals(list));
        System.out.println(p1.equals(p1));

//        p1 = p2; //把p2的地址传给p1;
    }
}

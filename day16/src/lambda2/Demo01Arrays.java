package lambda2;

/*
* lambda表达式有参数返回值的练习
* 需求： 使用数组存储多个Person对象
*        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
*
* */

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
                new Person("张三", 13),
                new Person("李四", 18),
                new Person("王五", 15),
                new Person("赵六", 16)
        };

        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //使用lambda简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        //遍历数组
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}

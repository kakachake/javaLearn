package lesson02Lambda;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/*
* 如果一个方法的返回值是一个函数式接口，那么就可以直接返回一个Lambda表达式
* 当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时，
* 就可以调用此方法
* */
public class Demo04Comparator {

    //定义一个方法，方法的返回值使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        //方法的返回值类型是一个接口，那么我们可以返回这个接口的匿名内部类
        return (String o1, String o2)->{
            return o2.length() - o1.length();
        };
    }

    public static void main(String[] args) {
        String[] arr = {"aa", "d", "ccc"};
        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (String o1, String o2)->{
            return o1.length() - o2.length();
        });
        System.out.println(Arrays.toString(arr));
    }
}

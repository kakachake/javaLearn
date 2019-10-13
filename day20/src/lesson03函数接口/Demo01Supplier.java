package lesson03函数接口;

import java.util.function.Supplier;

/*
 * 常用的函数式接口
 * java.util.function.Supplier<T>接口仅包含一个无参的方法, T get()，用来获取
 * 一个泛型参数指定类型的对象数据
 *
 * Supplier<T>接口被称之为生产型接口，指定接口是什么类型，那么接口的get方法就会生产
 * 什么类型的数据
 * */
public class Demo01Supplier {
    //定义一个方法，方法的参数传递Supplier<T>接口，泛型指定为String，get方法就会
    //返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        System.out.println(getString(()->"hello"+"world"));
    }

}

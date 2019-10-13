package lesson03函数接口;

import java.util.function.Predicate;

/*
 * java.util.function.Predicate<T>接口
 * 作用：对某种数据类型的数据进行判断，接口返回一个boolean值
 *
 * predicate接口包含一个抽象方法
 *   boolean test(T t): 用来指定数据类型数据进行判断的方法
 *       结果：
 *           符合条件：返回True
 *           不符合：返回False
 * */
public class Demo05Predicate {
    /*
     * 定义一个方法
     * 参数传递一个String类型的字符串
     * 传递一个Predicate接口的方法test对字符串进行判断，并把判断的结果返回
     * */

    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    //调用checkString方法对字符串进行校验，参数传递字符串和一个lambda表达式
    public static void main(String[] args) {
        String s = "abcde";

        boolean b =checkString(s, (String str)->{
            return str.length() > 5;
        });
        System.out.println(b);
    }
}

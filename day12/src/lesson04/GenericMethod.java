package lesson04;

/*
* 定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间
*
* 格式：
*     修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
*       方法体;
*     }
*     含有泛型的方法，在调用方法的时候确定泛型的数据类型
* */

public class GenericMethod {

    //定义一个泛型的方法
    public <E> void method(E data){
        System.out.println(data);
    }

    //定义一个含有泛型的静态方法
    public static <E> void method02(E data) {
        System.out.println(data);
    }
}

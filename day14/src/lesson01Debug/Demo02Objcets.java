package lesson01Debug;

import java.util.Objects;

/*
* Objects类中的静态方法
* Public static <T> T requireNonNull(T obj)查看指定引用对象不是null
* */
public class Demo02Objcets {

    public static void main(String[] args) {
//        method(null);

        Objects.requireNonNull(null);
    }

    public static void method(Object obj) {
        //对传递过来的参数进行合法性判断，判断是否为空
//        if(obj == null){
//            throw new NullPointerException("传递的对象为空");
//        }
        Objects.requireNonNull(null);
    }
}

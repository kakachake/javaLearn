package lesson01Debug;

import java.util.ArrayList;

/*
* 异常的注意事项
* */
public class Demo05Exception {
    public static void main(String[] args) {
        /*
        * 多个异常使用捕获如何处理：
        *   1.多个异常分别处理
        *   2.多个异常一次捕获多次处理
        *   3.多个一场一次捕获一次处理
        * */
        int[] arr = {1, 2, 3};
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        //1.多个异常分别处理
        try{
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3
        }catch (Exception e) {
            System.out.println(e);
        }

        try{
            System.out.println(arr2.get(2));//ArrayIndexOutOfBoundsException: 3
        }catch (Exception e) {
            System.out.println(e);
        }

        //2.多个异常一次捕获，多次处理
        /*
         * 一个try多个catch注意事项：
         *   catch里面定义的异常变量，如果有字符类关系，那么子类的
         *   异常必须写在上面，否则就会报错
         *   ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         *
         *
         * */
        try{
            System.out.println(arr[0]);//ArrayIndexOutOfBoundsException: 3
            System.out.println(arr2.get(2));//IndexOutOfBoundsException: 3
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }


        System.out.println("后续代码");

    }
}

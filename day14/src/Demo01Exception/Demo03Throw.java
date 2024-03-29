package Demo01Exception;

/*
* throw关键字
*  作用：
*       可以使用throw关键字在指定的方法中抛出指定的异常
*  使用格式：
*       throw new xxxException("异常产生的原因")
*   注意：
*       1.throw关键字必须写在方法的内部
*       2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
*       3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
*           throw关键字后面创建的是RuntimeException或者其子类对象，我们可以不处理，默认
*           交给JVM处理(打印异常对象，中断程序)
*           throw关键字后面创建的是编译异常（写代码的时候报错，我们就必须处理这个异常），
*           要么throws，要么try....catch
* */

import java.util.ArrayList;

public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        getElement(arr, -1);
    }



    /*
     * 定义一个方法，获取数组指定索引处的元素
     * 参数：
     *   int[] arr
     *   int index
     * 工作中首先必须对方法传递过来的参数进行合法性校验，如果参数
     * 不合法，那么我们必须使用抛出异常的方式，告知方法的调用者
     * */
    public static int getElement(int[] arr, int index){
        /*
        * 我们可以对传递过来的参数进行合法性的校验
        * 如果数组arr的值是null，
        * 那么我们就抛出空指针异常，告知方法的调用者“传递的数组为null”
        * 注意：
        *   NullPointerException是一个运行期异常，默认可以交给JVM处理
        * */
        if(arr == null){
            throw new NullPointerException("传递的数组为null");
        }

        /*
        * 我们可以对传递过来的参数index,进行合法性校验
        * 如果index的范围不再数组的索引范围内，
        * 我们就抛出数组索引越界异常，告知方法的调用者“传递的索引超出了数组的使用范围”
        * */

        if(index < 0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("数组索引越界！");
        }
        int ele = arr[index];
        return ele;
    }
}

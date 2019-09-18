package Demo01;

import java.util.Arrays;

/*
 * 1.public static long currentTimeMillis()
 * 返回以毫秒为单位的当前时间。注意，当返回值的时间单位是毫秒时，值的粒度取决于底层操作系统，并且粒度可能更大。例如，许多操作系统以几十毫秒为单位测量时间
 *
   2.public static void arraycopy(Object src, //原数组
                             int srcPos, //原数组的起始位置
                             Object dest, //目标数组
                             int destPos, //目标数组的起始位置
                             int length) //赋值的数组元素的数量

 * */
public class Demo01System {

    public static void main(String[] args) {
        demo01(); //currentTimeMillis;
        demo02(); //arrayCopy
    }

    /*
    *
    * 将src数组中前3个元素，复制到dest数组的前3个位置上
    * 复制元素前：
    * src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
    * 复制元素后：
    * src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
    * */
    private static void demo02() {
        //定义原数组
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println(Arrays.toString(dest));
    }

    /*
     * public static long currentTimeMillis()
     * 返回以毫秒为单位的当前时间。
     * */
    private static void demo01() {
        //程序执行前获取一次毫秒值
        int num = 0;
        long s = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            num += i;
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }
}

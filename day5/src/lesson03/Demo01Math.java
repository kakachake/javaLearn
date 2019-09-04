package lesson03;


/*
*
* java.util.Math类
*
* public static double abs(double num): 获取绝对值
*
* public static double ceil(double num): 向上取整
*
* public static double floor(double num): 向下取整
*
* public static lang round (double num): 四舍五入
* */

public class Demo01Math {

    public static void main(String[] args) {
        //获取绝对值

        System.out.println(Math.abs(-2.5));

        //向上取整
        System.out.println(Math.ceil(-2.5));
        System.out.println(Math.ceil(2.5));

        //向下取整
        System.out.println(Math.floor(-2.5));
        System.out.println(Math.floor(2.5));

        //四舍五入
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.4));
        System.out.println(Math.PI);
    }

}

package lesson04VarArgs;

/*
* 可变参数：是JDK1.5之后出现的新特性
* 使用前提：
*       当方法的参数列表的数据类型已经确定，但是参数的个数不确定，就可以使用
*       可变参数
* 使用格式：
*       定义方法时使用
*           修饰符 返回值类型 方法名(数据类型 ... 变量名){}
* 可变参数原理：
*   可变参数底层就是一个数组，根据传递参数个数不同会创建不同长度的数组来存储这些参数
*   传递参数的个数，可以是0个（不传递），或者多个
* 注意事项：
*   1.一个方法的参数列表，只能有一个可变参数
*   2.如果方法的参数有多个，那么可变参数必须写在参数列表末尾
* */

public class Demo01VarArgs {

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4));
    }



    //定义一个方法，计算n个int类型整数的和
    public static int add(int ... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //可变参数的特殊（终极）写法
    public static void method(Object ...obj){
        
    }
}

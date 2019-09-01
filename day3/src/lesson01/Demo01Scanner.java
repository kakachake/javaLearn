package lesson01;

import java.util.Scanner; //1.导包

/*
* Scanner 类的功能，可以实现键盘输入数据到程序当中
*
* 引用类型的一般使用步骤
*
* 1.导包
*  import 包路径.类名称
*  如果使用的目标类，和当前的类位于同一个包下，则可以省略包语句不写
*  只有java.lang包下的内容不需要导包，其他的包都需要import
*
* 2.创建
* 类名称 对象名 = new 类名称()
*
* 3.使用
* 对象名.成员方法名()
*
* 获取键盘输入的int数字
* */
public class Demo01Scanner {

    public static void main(String[] args) {
        //2.创建
        //System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        System.out.println(sc.toString());
    }


}

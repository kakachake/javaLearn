package learn03;
/*
* 数组是一种引用类型的数据
* 数组当中的多个数据，类型必须统一
* 数组的长度在程序运行时不能改变
*
*
* 数组的初始化：在内存中创建数组，并向其中赋予一些默认值
*
* 1.动态初始化-指定长度
* 2.静态初始化-指定内容
*
* 动态初始化数组的格式
* 数据类型[] 数组名称 = new 数据类型[数组长度]
* 解析含义
* 左侧数据类型，也就是数组当中保存的数据，全都是统一的什么类型
* 左侧的中括号：代表我是一个数组
* 右侧的new 代表创建数组的动作
* 右侧的数据类型，必须和左边的数据类型保持一致
* 右侧中括号的长度，也就是数组当中，到底能保存多少个数据，是一个int数字
* */
public class Demo01Array {
    public static void main(String[] args) {

        //创建一个数组，放300个int数据
        int[] arrayA = new int[300];
        System.out.println(arrayA);

        double[] arrayB = new double[5];

        String[] arrayC = new String[5];

        System.out.println(arrayC);
    }
}

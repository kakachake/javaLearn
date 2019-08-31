package learn03;

/*
* 使用静态初始化数组的时候，格式还可以省略一下
*
* 标准格式
* 数据类型[] 数组名称 = new 数据类型[] {元素1， 元素2....}
*
* 省略格式
* 数据类型[] 数组名称 = {元素1， 元素2....}
*
* 注意事项：
* 1.静态初始化没有指定长度，但是仍会自动推算得到长度
* 2.静态初始化标准格式可以拆分成两个步骤
* 3.动态初始化也可以拆分成两个步骤
* */

public class Demo03Array {
    public static void main(String[] args) {
        int[]    arrayA = {1, 2, 3};
        System.out.println(arrayA.length);

        //静态初始化的标准格式，可以拆分成两个步骤
        int[] arrayC;
        arrayC = new int[] {1,2,3};

        //动态初始化也可以拆分成两个步骤
        int[] arrayB;
        arrayB =new int[4];

    }
}

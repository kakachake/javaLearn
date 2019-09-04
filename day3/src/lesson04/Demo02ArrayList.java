package lesson04;

/*
* 数组的长度不可以发生改变
* 但是Arraylist集合的长度是可以随意改变
*
* 对应Arraylist来说，有一个尖括号<E>代表泛型
* 泛型，也就是集合当中的所有元素，全部都是统一的什么类型
* 注意：泛型只能是引用类型，不能是基本类型
*
* 注意事项：
* 对于Arraylist集合来说，直接打印得到的不是地址值，而是内容。
* 如果内容是空，得到的是空的中括号：[]
* */
import java.util.ArrayList;

public class Demo02ArrayList {

    public static void main(String[] args) {
        //创建了一个Arraylist集合，集合的名字是arr，里面装的都是String类型的字符串
        //备注：从jdk1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写
        ArrayList<String> arr = new ArrayList<>();
        System.out.println(arr);


        //向集合中添加数据，需要用到add方法
        arr.add("赵丽颖");
        arr.add("古力娜扎");
        System.out.println(arr);
        //错误写法，只能添加String类型，不能添加其他类型
    }
}

package lesson01;

/*
* 字符串截取方法
*
* public String substring(int index), 截取从参数位置到字符串末尾，返回新的字符串
*
* public String substring(int begin, int end), 截取从begin开始，一直到end结束，中间的字符串
*
* 备注：[begin, end)左闭右开
* */

public class Demo04Substring {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String sub1 = str1.substring(6);
        String sub2 = str1.substring(0,6);
        System.out.println(sub1);
        System.out.println(sub2);


    }
}

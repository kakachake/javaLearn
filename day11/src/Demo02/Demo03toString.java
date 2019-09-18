package Demo02;

/*
* StringBuilder和String可以相互转换
*   String -> StringBuilder：可以使用stringBuilder构造方法
*   StringBuilder -> String:可以使用StringBuilder中的toString方法
* */

public class Demo03toString {

    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder("abc");
        String str = bu.toString();
        System.out.println(str);
    }
}

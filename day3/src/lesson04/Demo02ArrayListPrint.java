package lesson04;

/*
* 定义以指定格式打印集合的方法（ArrayList类型作为参数）,使用{}扩起集合，使用@分隔每个元素
* 格式参照{元素@元素@元素}
* */

import java.util.ArrayList;

public class Demo02ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        System.out.println(list);

        printArrayList(list);
    }

    /*
    * 定义方法三要素
    * 返回值类型：只是进行打印，返回值为void
    * 方法名称：printArrayList
    * 参数列表
    * */
    
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+"@ ");
            }

        }
        System.out.println("}");
    }
}

package lesson01Stream;

import java.util.ArrayList;
import java.util.List;

/*
* 使用传统的方式，遍历集合，对集合中的数据进行遍历
* */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        //对list集合的元素进行过滤，只要以张开头的元素，储存到一个新的集合中
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                listA.add(s);
            }
        }
        
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length()==2){
                listB.add(s);
            }
        }
        System.out.println(listB);
    }
}

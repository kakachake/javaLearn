package lesson04;

/*
*用一个大集合存入20个随机数字，然后筛选其中的偶数数字，放到小集合中
* 要求使用自定义方法来实现筛选
*
*
*
* */

import java.util.ArrayList;
import java.util.Random;

public class Demo07ArrayListReturn {

    public static void main(String[] args) {
        Random ran = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(ran.nextInt(100));
        }
        System.out.println(list);
        System.out.println(getSmallList(list));
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> rList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            if(temp%2 == 0){
                rList.add(temp);
            }
        }

        return rList;
    }
}

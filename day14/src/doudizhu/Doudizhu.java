package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Doudizhu {

    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的HashMap<Integer,String>
        HashMap<Integer,String> poker = new HashMap<>();
        //定义两个数组，一个数组存储牌的花色，一个存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先把大王小王存储到poker集合中
        Integer idx = 0;
        poker.put(idx++, "大王");
        poker.put(idx++, "小王");
        //循环嵌套遍历两个数组组装五十二张牌
        for(String number: numbers){
            for (String color : colors) {
//                System.out.println(color+" "+number);
                poker.put(idx++, color+" "+number);
            }
        }
        System.out.println(poker);
        ArrayList<Integer> key =new ArrayList(poker.keySet());

        Collections.shuffle(key);

        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            Integer p = key.get(i);
            if(i>=51){
                dipai.add(p);
            }else{
                int n = i%3;
                switch (n){
                    case 0:
                        player01.add(p);
                        break;
                    case 1:
                        player02.add(p);
                        break;
                    case 2:
                        player03.add(p);
                        break;
                }
            }
        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        System.out.print("玩家一：{");
        for (Integer s : player01) {
            System.out.print(poker.get(s)+",");
        }
        System.out.println("}");
        System.out.print("玩家二：{");
        for (Integer s : player02) {
            System.out.print(poker.get(s)+",");
        }
        System.out.println("}");
        System.out.print("玩家三：{");
        for (Integer s : player03) {
            System.out.print(poker.get(s)+",");
        }
        System.out.println("}");

    }
}

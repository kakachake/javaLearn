package lesson05;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
* 1.准备牌
* 2.洗牌
* 3.发牌
* 4.看牌
*
* */
public class DemoDouDiZhu {

    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList<String>
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个数组存储牌的花色，一个存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //先把大王小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组组装五十二张牌
        for(String number: numbers){
            for (String color : colors) {
//                System.out.println(color+" "+number);
                poker.add(color+" "+number);
            }
        }

        //2.洗牌
        //使用集合Collections类中的方法shuffle(<List<?>list)
        Collections.shuffle(poker);
//        System.out.println(poker);

        /*
        * 3.发牌
        * */
        //定义四个集合，用来存储玩家和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        /*
        * 遍历poker集合，获取每一张牌
        * 使用poker集合的索引给三个玩家轮流发牌
        * 剩余三张牌给底牌
        * 注意：
        *     先判断底牌(i>=51), 否则牌就发没了
        * */
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
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
        System.out.println(player01.toString());
        System.out.println(player02.toString());
        System.out.println(player03.toString());
        System.out.println(dipai.toString());
    }
}

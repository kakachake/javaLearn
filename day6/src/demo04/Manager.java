package demo04;

import java.util.ArrayList;

//群主的类

public class Manager extends User {
    public Manager() {

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //首先需要一个集合，用来存放若干个红包的余额
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getMoney();

        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }

        //扣钱，其实就是重新设置余额

        super.setMoney(leftMoney - totalMoney);

        //发红包需要重新拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; //余数，也就是剩下的零头

        //剩下的零头包在最后红包中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        int last = avg + mod;

        redList.add(last);

        return redList;
    }
}

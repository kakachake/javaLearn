package Demo07;

import red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        //随机分配，有可能多，有可能少。
        //最少是一分钱,最多不超过“剩下金额平均数的2倍”
        //首先创建一个随机生成器
        // totalMoney是总金额，totalCount是总个数
        // 额外定义两个变量，分别代表剩下多少钱，剩下多少份
        int leftMoney = totalMoney;
        int leftTotal = totalCount;

        for (int i = 0; i < totalCount-1; i++) {
            int randomMoney = getRandomMoney(leftMoney, leftTotal);
            list.add(randomMoney);
            leftMoney -= randomMoney;
            leftTotal--;
        }
        list.add(leftMoney);
        return list;
    }

    public int getRandomMoney(int leftMoney, int leftTotal) {
        int randomMoney;
        Random r = new Random();
        randomMoney = 1+r.nextInt(leftMoney / leftTotal * 2);
        return randomMoney;
    }
}

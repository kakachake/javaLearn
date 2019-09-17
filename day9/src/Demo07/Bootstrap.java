package Demo07;
/*
* 场景说明：
*   红包发出去之后，所有人都有红包，大家抢完之后，最后一个红包给群主自己
*
* 红包分发的策略：
*   1.普通红包（平均）：totalMoney / totalCount.余数放在最后一个红包当中
*   2.手气红包（随机）：最少1分钱，最多不超过平均数的2倍
*
* 我们自己要做的有：
*   1.设置一下程序的标题，通过构造方法的字符串参数
*   2.设置群主名称
*   3.设置分发策略，平均还是随机
* */

import red.OpenMode;
import red.RedPacketFrame;

public class Bootstrap {

    public static void main(String[] args) {
        MyRed red = new MyRed("抢红包");

        //设置群主名称
        red.setOwnerName("张三");

        //随机红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
//
//        //普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);
    }
}
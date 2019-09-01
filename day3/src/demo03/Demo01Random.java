package demo03;

/*
*Random类用来生成随机数字， 使用起来也是三个步骤
*
* 1.导包
* 2. 创建
* Random r = new random
* 3.使用
* 获取一个随机的数字，范围是int所有范围，有正负两种
* */

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0 ; i < 100; i++){
            System.out.println(random.nextInt(200));
        }
    }

}

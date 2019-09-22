package lesson07MapEntry;

/*
* 练习：
*       计算一个字符串每个字符出现的次数
* 分析：
*       1.使用Scanner获取用户输入的字符串
*       2.创建Map集合，key是字符串中的字符，value是字符的个数
*       3.遍历字符串获取每一个字符
*       4.使用获取到的字符去Map集合判断key是否存在
* */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Demo04MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Integer val = map.get(ch);
            if(val!= null){
                map.put(ch,val+1);
            }else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);

    }
}

package lesson01;

/*
* 题目：
* 键盘输入一个字符串、并且统计其中各种字符串出现的次数
* 种类有：大写字母、小写字母、数字、其他
*
* 思路：
* 1.既然用到键盘输入，肯定是Scanner
* 2.键盘输入的是字符串，那么String str= sc.next();
* 3.定义四个变量，分别代表四种字符个字出现的次数
* 4.需要对字符串一个字、一个字的检查，String--->char[], 方法就是toCharArray()
* 5.遍历char[]字符数组，对当前字符的种类进行判断,并且用四个变量进行++动作
* */

import java.util.Scanner;

public class Demo08StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String input = sc.next();  //获取键盘输入的一个字符串

        int countUpper = 0; //大写字母
        int countLower = 0; //小写字母
        int countNumber = 0; //数字
        int countOther = 0; //其他字符

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i]; //当前单个字符
            if('A'<= ch && ch <= 'Z'){
                countUpper++;
            }else if('a'<=ch&& ch <= 'z'){
                countLower++;
            }else if('0' <= ch && ch <= '9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println(countLower);
        System.out.println(countUpper);
        System.out.println(countNumber);
        System.out.println(countOther);
    }
}

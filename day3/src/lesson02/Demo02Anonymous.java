package lesson02;

import java.util.Scanner;

public class Demo02Anonymous {

    public static void main(String[] args) {

        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();


        //匿名对象方式

        int num = new Scanner(System.in).nextInt();
        System.out.println(num);

        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num2 = sc.nextInt();
        System.out.println("return"+num2);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}

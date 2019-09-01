package lesson01;
import java.util.Scanner;

/*
* 键盘输入两个int数字并求和
*
* 1. 使用Scanner
* 2. 导包，创建，使用
* 3. 需要的是两个数字，所以调用两次nextInt方法
* */


public class Demo01ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}

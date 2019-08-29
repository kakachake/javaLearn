package learn2;

/*
*
* 方法重载与参数类型无关
* 与方法的返回值类型无关
* */

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
        System.out.println(sum(1,2));
        System.out.println(sum(1,2, 3));//重载
        System.out.println(sum(1.1, 1.2));//类型重载
        System.out.println(sum(1, 1.2));//类型顺序重载
        System.out.println(sum(1.1, 1));//类型顺序重载
    }

    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println("*");
        }
    }

    public static int sum(int a, int b){
        return a + b;
    }


    /*方法重载*/
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

/*  错误写法！！ 与方法的返回值无关
    public static int double(int a, int b, int c){
        return a + b + c;
    }*/

    public static double sum(double a, double b){
        return  a + b;
    }

    public static double sum(int a, double b){
        return  a + b;
    }

    public static double sum(double a, int b){
        return  a + b;
    }
}

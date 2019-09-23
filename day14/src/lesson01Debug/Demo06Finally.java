package lesson01Debug;
/*
* 如果finally有return语句, 永远返回finally中的结果，避免该情况
* */

public class Demo06Finally {

    public static void main(String[] args) {
        System.out.println(getA());
    }

    public static Object getA() {
        int a = 10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            //一定会执行的代码
            return -1;
        }
    }
}

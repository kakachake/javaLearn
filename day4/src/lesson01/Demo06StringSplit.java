package lesson01;

/*
* 分割字符串方法
* public String[] split(String regex): 按照参数的规则，将字符串切分成若干部分
*
* 注意事项：
* split方法参数其实是一个正则表达式
* 今天要注意，如果按照英文句点"."进行切分，必须写"\\."(两个反斜杠)
* */

public class Demo06StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] arr = str1.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("==================================");

        String str2 = "aaa bbb ccc";
        str2.split(" ");
        String[] arr2 = str2.split(" ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        String str3 = "XXX.YYY.ZZZ";
        String[] arr3 = str3.split("\\.");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}

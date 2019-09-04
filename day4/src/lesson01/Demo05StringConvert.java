package lesson01;

/*
* String 当中与转换相关的常用方法有
*
* public char[] toCharArray(), 将当前字符串拆分成字符数组作为返回值
*
* public byte[] getBytes(), 获得当前字符串底层的字节数组
*
* public String replace(CharSequence oldString, CharSequence newString):
* 将所有的老字符串替换为新字符串
* 备注：CharSequence意思就是说可以接受字符串类型。
* */

public class Demo05StringConvert {

    public static void main(String[] args) {
        //转换为字符数组
        char[] ch = "Hello".toCharArray();
        System.out.println(ch);

        //转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //替换字符串
        String str = "hi world! java";
        String reStr = str.replace("hi", "hello");
        String reStr1 = str.replace("a", "h");//可以替换多个
        System.out.println(reStr);
        System.out.println(reStr1);


        String lang1 = "替换单词";
        String lang2 = lang1.replace("替换单词", "****");
        System.out.println(lang2);

    }
}

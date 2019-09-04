package lesson02;

import java.util.Arrays;

public class Demo02Array2Practice {

    public static void main(String[] args) {
        String str = "ssv3278gsdfjkjbkand2qwe67jlkqlz";

        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
//        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
    }
}

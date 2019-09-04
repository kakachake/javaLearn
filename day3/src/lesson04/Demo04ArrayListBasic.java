package lesson04;

import java.util.ArrayList;

/*
* 如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的"包装类"
*
* 基本类型  包装类（引用类型，包装类都位于java.lang包下）
* byte  Byte
* int   Integer
* short Short
* long  Long
* double    Double
* float Float
* char  Character
* boolean   Boolean
*
* 从jdk1.5+开始，我们支持自动装箱自动拆箱
* 自动装箱：基本类型------>包装类型
* 自动拆箱：包装类型------>基本类型
*
* */

public class Demo04ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
//        ArrayList<int> listB = new ArrayList<>(); //泛型只能存储引用类型
        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);//自动装箱
        listC.add(200);
        System.out.println(listC);
        System.out.println(listC.get(0));
    }
}

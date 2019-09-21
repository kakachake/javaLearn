package lesson04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 泛型的上限限定：?extend E 我是用的泛型只能是E类型的子类或本身
* 泛型的下线限定：?super E 我使用的泛型只能是E类型的父类或本身
*
* */
public class Demo06Generic {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement(list1);
//        getElement(list2);//报错
        getElement(list3);
//        getElement(list4);//报错

//        getElement2(list1);//报错
//        getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);

    }
    // 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
    public static void getElement(Collection<? extends Number> coll){}
    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){}
}

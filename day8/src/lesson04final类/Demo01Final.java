package lesson04final类;

/*
* final关键字代表最终、不可改变的。
* 常见四种：
* 1.可以用来修饰一个类
* 注意：一个类如果是final的，那么其中的所有成员方法都无法进行覆盖重写
* 2.也可以用来修饰一个方法
* 3.还可以用来修饰一个局部变量（只能赋值一次）
* 4.还可以用来修饰一个成员变量
*注意：
* 对于基本类型来说：不可变是变量当中的数据不可改变
* 对于引用类型来说：不可变是变量中的地址值不可改变
*
* */

public class Demo01Final {

    public static void main(String[] args) {
        final int num1 = 10;
        System.out.println(num1);
//        num1 = 20; final不能被重写

        //正确写法，只要保证有唯一一次赋值即可
        final int num2;
        num2 = 30;

        final Student student = new Student("赵丽颖");
        System.out.println(student.getName());
        student.setName("霍建华"); //可以改变引用所指向的地址的数据值
        //final关键字修饰，不能改变地址值
//        student = new Student("霍建华");
//        System.out.println(student.getName());
    }
}

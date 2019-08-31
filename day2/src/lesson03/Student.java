package lesson03;

/*
* 构造方法是专门用来创建对象的方法，当我们通过关键字创建对象时，其实就是在调用构造方法
* 格式
* public 类名称（参数类型 参数名称）{
*   方法体
* }
*
* 注意：
* 1.构造方法的名称必须和所在类的名称完全一样，就连大小写也要一样
* 2.构造方法不要写返回值，连void也不写
* 3.构造方法不能return一个具体的返回值
* 4. 如果没有编写构造方法，那么编译器会默认一个构造方法
* 5. 构造方法也可以进行重载
 * */

public class Student {
    String name;
    int age;

    public Student(){//无参构造方法若需要则必须自己写
        System.out.println("无参数构造方法");
    }

    public Student(int age){
        this.age = age;
    }

    public Student(String name){
        System.out.println("构造方法执行了");
        this.name = name;
    }

}

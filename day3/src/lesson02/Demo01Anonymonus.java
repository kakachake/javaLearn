package lesson02;

/*
* 创建对象的格式
* 类名称 对象名 = new 类名称();
*
* 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
*
* new 类名称();
*
* 注意： 匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象
*
* 如果确定有一个对象只需要使用一次，就可以使用匿名对象
* */

public class Demo01Anonymonus {
    public static void main(String[] args) {
        //普通对象
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();

        //匿名对象
        new Person().name = "赵又廷";
        new Person().showName(); //null；
    }
}

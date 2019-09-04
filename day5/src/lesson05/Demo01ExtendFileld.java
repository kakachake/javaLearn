package lesson05;

/*
* 在父类的继承关系中，如果变量重名，则创建子类对象时，访问有两种方式：
*
* 直接通过子类对象访问成员变量
* 间接通过成员方法访问成员变量
*     方法属于谁就优先用谁，找不到就向上找
* */

public class Demo01ExtendFileld {

    public static void main(String[] args) {
        FatherClass fu = new FatherClass(); //创建父类对象
        System.out.println(fu.numFa);//只能使用父类的东西，没有子类内容

        SonClass son = new SonClass();
        System.out.println(son.numFa);
        System.out.println(son.numSon);
        System.out.println(son.num);
        son.getNumFa();//间接通过成员方法访问成员变量

        son.methodFu(); //父类num
        son.methodZi(); //子类num

    }
}

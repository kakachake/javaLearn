/*
 * 接口就是多个类的公共规范
 * 接口就是一种引用数据类型，最重要的内容就是其中的抽象方法
 * 如何定义一个接口格式：
 * public interface 接口名称{
 *
 *       //接口内容
 * }
 *
 * 备注：换成了关键字interface之后，编译生成的字节码文件仍然是 .java --> .class
 *
 * 如果是java 7，那么接口中可以包含的内容有：
 * 1.常量
 * 2.抽象方法
 *
 * 如果是Java 8, 还可以额外包含有：
 * 3.默认方法
 * 4.静态方法
 *
 * 如果是Java 9，还可以额外包括：
 * 5.私有方法
 *
 * 接口使用步骤
 * 1.接口不能直接使用，必须有一个‘实现类’来实现该接口
 * 格式：
 * public class 类名称 implements 接口名称
 *
 * 2.接口的实现必须覆盖重写接口中所有的抽象方法
 * 实现：去掉abstract关键字，加上方法体大括号
 * 3.创建实现类的对象，进行使用
 *
 * 注意
 * */
public class Dem01Interface {

    public static void main(String[] args) {
        MyInterfaceAbstaractImpl myInterfaceAbstaract = new MyInterfaceAbstaractImpl();
        myInterfaceAbstaract.methodAbs();
        myInterfaceAbstaract.methodAbs2();
        myInterfaceAbstaract.methodAbs3();
        myInterfaceAbstaract.methodAbs4();
    }

}

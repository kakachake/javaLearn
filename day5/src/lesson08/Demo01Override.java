package lesson08;

/*
* 方法覆盖注意事项
* 1.注意保证父子类之间方法的名称相同，参数列表也相同
* @override: 写在方法的前面，用来检测是不是有效的正确覆盖重写
* 这个注解就算不写，只要满足要求也是正确的方法覆盖重写
*
* 2.子类方法的返回值必须小于等于父类方法的返回值
* 前提：Object类是所有类的公共最高父类
*
* 3.子类方法的权限必须大于等于父类方法的权限修饰符：public...
* public>protected>default>private
* (备注：default不是关键字，二是什么都不写，留空)
* */

public class Demo01Override {
    public static void main(String[] args) {
        Son son = new Son();
        son.method();
    }
}

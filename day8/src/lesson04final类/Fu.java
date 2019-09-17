package lesson04final类;

/*
* 当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写
* 格式：
* 修饰符 final 返回值类型 方法名称(参数列表){
*       //方法体
* }
* */

public class Fu {

    public void method(){
        System.out.println("父类方法执行");
    }

    public final void method2(){
        System.out.println("父类final方法");
    }
}

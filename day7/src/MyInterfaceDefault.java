
/*
* 从java 8开始，接口里允许重新定义默认方法
* 格式：
* public default 返回值类型 方法名称(参数列表){
*   方法体
* }
*
* 备注：接口当中的默认方法， 可以解决接口升级的问题
* */

public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();

    //添加一个抽象方法
//    public abstract void methodAbs2();

    //新添加的方法改成默认方法
    public default void methodDefault() {
        //这是新添加的默认方法
        System.out.println("这是新添加的默认方法");
    }
}

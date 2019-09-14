/*
* 这个子接口有四个方法
* */

public interface MyInterfaceE  extends MyInterfaceC, MyInterfaceD{

    public abstract void method();

    @Override
    public default void methodDefault(){
        System.out.println("default");
    }
}

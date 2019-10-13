package lesson01FunctionInterface;

/*
* 函数式接口的使用：一般可以作为方法的参数和返回值类型
* */
public class Demo {
    //定义一个方法，参数使用函数式接口
    public static void show(Demo01MyFunctionInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，可以传递接口的匿名内部类
        show(new Demo01MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类");
            }
        });

        show(()->{
            System.out.println("使用Lambda表达式");
        });

        //简化Lambda表达式
        show(()-> System.out.println("使用Lambda表达式"));
    }
}

package Demo04;


/*
 * 如果是接口的实现类（或者是父类的子类）只需要使用唯一的一次
 * 那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。
 *
 * 匿名内部类的定义格式
 *
 * 接口名称 对象名 = new 接口名称(){
 *      //覆盖重写所有抽象方法
 * };
 *
 * 对格式“new 接口名称() {...}” 运行解析：
 * 1.new代表创建对象的动作
 * 2.接口名称就是匿名内部类需要实现哪个接口
 * 3.{....}匿名内部类的内容
 *
 * 另外还要注意：
 * 1.匿名内部类在创建对象时，只能使用唯一一次
 * 2.匿名对象在调用方法的时候只能调用唯一一次。
 * 如果希望同一对象调用多次，那么必须给对象起一个名字
 * 3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
 * */

public class DemoMain {

    public static void main(String[] args) {

        //创建匿名内部类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("这是匿名内部类");
            }

            @Override
            public void method2() {
                System.out.println("111");
            }
        };
        myInterface.method();

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("这是匿名内部类");
            }

            @Override
            public void method2() {
                System.out.println("111");
            }
        }.method2();
    }
}

package lesson04MethodReference;

/*
* 定义子类
* */

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("hello, i'm man");
    }

    //定义一个方法，传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void sayHi(){
        System.out.println("hi, i'm man");
    }

    public void show(){
        //调用method方法，方法的参数greetable是一个函数式接口，可以传递Lambda表达式
//        method(()->{
//            //创建父类对象
//            Human h = new Human();
//            //调用父类的sayHello方法
//            h.sayHello();
//        });

        method(super::sayHello);
        method(this::sayHi);
        //因为有字符类关系，所以存在关键字super代表父类，我们可以直接使用
        //super调用父类的成员方法
    }

    public static void main(String[] args) {
        new Man().show();
    }
}

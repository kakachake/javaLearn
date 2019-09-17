package lesson04final类;

public class Zi extends Fu {

    public void method(){
        System.out.println("子类覆盖父类的方法");
    }

    //错误写法！不能覆盖重写父类当中final的方法
//    public void method2(){
//        System.out.println("");
//    }
}

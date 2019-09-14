package lesson01;

public class Zi extends Fu {

    int num = 2;


    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void getNum(){
        System.out.println(this.num);
    }

    public void methodZi(){
        System.out.println("子类");
    }
}

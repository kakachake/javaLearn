package lesson01;

public class Fu {

    int num = 1;

    public void method(){
        System.out.println("父类方法");
    }

    public void getNum(){
        System.out.println(this.num);
    }

    public void methodFu(){
        System.out.println("父类");
    }
}

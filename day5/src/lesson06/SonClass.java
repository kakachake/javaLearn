package lesson06;

public class SonClass extends FatherClass {
    int num = 10;

    public void method() {
        int num = 30;
        System.out.println("函数内部变量"+num); //函数内部变量
        System.out.println("类里面两"+this.num); //类里面两
        System.out.println("父类的成员变量"+super.num); //父类的成员变量
    }
}

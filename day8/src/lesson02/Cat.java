package lesson02;

public class Cat extends Animal{

    public void eat(){
        System.out.println("猫吃鱼");
    }

    //子类特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

package lesson02;

/*
* 如何才能知道一个父类引用的对象，本来是什么子类
* 格式：
* 对象 instanceof 类型
* 这将得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例
* */

public class Demo03Instanceof {

    public static void main(String[] args) {
        Animal animal = new Cat(); //本来是一只猫
        animal.eat(); //猫吃鱼

        // 如果希望用子类特有方法，需要向下转型
        System.out.println(animal instanceof Animal); //true
        System.out.println(animal instanceof Cat); //true
        System.out.println(animal instanceof Dog); //false

        if( animal instanceof Cat ){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        if( animal instanceof Dog ){
            Dog dog = (Dog) animal;
            dog.eat();
        }
    }

    public static void giveMeAPet(Animal animal) {

    }
}

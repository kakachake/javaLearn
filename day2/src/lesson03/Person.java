package lesson03;

public class Person {
    String name;
    static int  age = 2;
    public void sayHello(String name) {
        System.out.println(name + ",您好， 我是" + this.name);
    }
}

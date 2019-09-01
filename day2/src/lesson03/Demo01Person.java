package lesson03;

public class Demo01Person {
    public static void main(String[] args) {
        System.out.println(Person.age);
        Person person = new Person();
        person.name = "张三";
        person.sayHello("王思聪");
    }
}

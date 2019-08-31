package lesson02;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.setAge(19);
        person.name = "赵丽颖";
        person.show();
        System.out.println(person.getAge());
    }
}

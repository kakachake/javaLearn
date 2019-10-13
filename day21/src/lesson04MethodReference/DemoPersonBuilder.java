package lesson04MethodReference;

/*
* 类的构造器（构造方法）引用：
* */

public class DemoPersonBuilder {
    //定义一个方法，参数传递姓名和PersonBuilder接口，方法中，通过姓名创建person对象
    public static void printName(String name, PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        printName("张三", (name)->{
            return new Person(name);
        });

        //使用方法引用优化Lambda表达式
        //构造方法new Person(String name)已知
        //创建对象已知new
        printName("李四", Person::new);//使用Person类的带参构造方法通过传递的姓名创建对象
    }
}

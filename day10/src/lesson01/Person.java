package lesson01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        //增加一个判断，传递的参数如果是null,直接返回false
//        if(obj == null) {
//            return false;
//        }
//
//        if(this == obj){
//            return true;
//        }
//
//        //增加一个判断，防止类型转换异常
//        //使用向下转型
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        Person p = (Person)obj;
//        if(this.name.equals(p.name) && this.age == p.age){
//            return true;
//        }else{
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass() 使用反射技术判断是否为Person类型
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}

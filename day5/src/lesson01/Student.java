package lesson01;

public class Student {

    private int id;
    private String name; //姓名
    private int age; //年龄
    static String room;

    private static int idCounter = 0;

    public Student(){
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int age) {
        this.id = ++idCounter;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

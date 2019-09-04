package lesson04;

/*
* 题目：
* 自定义4个学生对象，添加到集合，并遍历
*
* 思路：
* 1. 自定义Student学生类，四个部分。
* 2. 创建一个集合用来存储学生对象。泛型：<Student>
* 3. 根据类创建4个学生对象
* 4. 将4个学生对象添加到集合中：add
* 5. 遍历集合：for、size、get
*
* */

import java.util.ArrayList;

public class Demo06ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("张三", 14);
        Student two = new Student("李四", 15);
        Student three = new Student("王五", 16);
        Student four = new Student("嘟嘟", 16);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.age+stu.name);
        }
    }
}

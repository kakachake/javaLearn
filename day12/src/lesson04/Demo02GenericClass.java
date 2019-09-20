package lesson04;

public class Demo02GenericClass {
    public static void main(String[] args) {

        //不写泛型,默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("张三");
        System.out.println(gc.getName());

        //创建一个GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(123);
        System.out.println(gc2.getName());

        //创建一个GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("张三");
        System.out.println(gc3.getName());
    }
}

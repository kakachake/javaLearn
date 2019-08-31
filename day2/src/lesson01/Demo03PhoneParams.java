package lesson01;

public class Demo03PhoneParams {
    String name;
    static int a;
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "华为";
        phone.price = 4000;
        phone.color = "蓝色";
        Phone two = method(phone); //可传入
        System.out.println(two.price);
        System.out.println(phone.price);
    }
    public static Phone method(Phone param) {
//        System.out.println(name);
        System.out.println(param.brand);
        param.price = 0.1;
        System.out.println(a);
        return param; //可返回
    }


    public void method(){
        System.out.println(name);
    }
}

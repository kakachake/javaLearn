package lesson01;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "华为";
        phone.color = "皓月白";
        phone.price = 3900;
        System.out.println(phone.brand);
        phone.call("张泰民");
    }
}

package Demo05;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero("张三",new Weapon("M4A1"),13);
        System.out.println(hero.getWeapon().getCode());
        System.out.println(hero.getAge());
        System.out.println(hero.getName());


    }
}

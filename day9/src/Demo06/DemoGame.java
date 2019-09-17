package Demo06;

public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("斯沃特");
        hero.setSkill(new Skill() { //创建一个匿名Skill
            int num = 1;
            @Override
            public void use() {
                for (int i = 0; i < num; i++) {
                    System.out.print("哒");
                }
                System.out.println("");
                num++;
            }
        });
        hero.getSkill().use();
        hero.getSkill().use();
        hero.getSkill().use();
        hero.getSkill().use();
    }
}

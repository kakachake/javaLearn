package Demo02;

public class Body {

    public class Heart{

         public void beat() {
             System.out.println("心脏跳动");
             System.out.println("我叫"+name);
         }
    }

    private String name = "哈哈哈";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外部类方法
    public void methodBody(){
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
    }
}

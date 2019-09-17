package Demo;

/*
*           public > protected > default > private
*
* 同一个类    yes       yes        yes       yes
*
* 同一个包    yes       yes        yes       no
*
* 不同包子类  yes       yes        no        no
*
* 不同包非子类yes       no         no        no
*
* 注意事项：（default）并不是关键字“default”，而是根本不写
* */
public class Demo01Main {

    public static void main(String[] args) {
        MyAnother an = new MyAnother();
        System.out.println(an.num);
    }
}

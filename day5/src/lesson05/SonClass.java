package lesson05;

public class SonClass extends FatherClass {

    int numSon = 20;

    int num = 100;

    public void getNumFa(){
        System.out.println(this.numFa);
    }

    public void methodZi(){
        System.out.println("子类"+num);
    }
}

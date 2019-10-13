package lesson02Lambda;

public class Demo03Runable {


    public static void main(String[] args) {
        new Thread(()-> System.out.println(111)).start();
    }
}

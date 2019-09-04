package lesson04;

import java.util.ArrayList;
import java.util.Random;

public class Demo05ArrayListRandom {
    public static void main(String[] args) {
        Random ran = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < 6; i++){
            list.add(ran.nextInt(33)+1);
        }

        System.out.println(list);
    }
}

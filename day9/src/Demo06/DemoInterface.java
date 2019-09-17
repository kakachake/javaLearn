package Demo06;

import java.util.ArrayList;
import java.util.List;

/*
* java.util.list是ArrayList所实现的接口
* */

public class DemoInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = addNames(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        return list;
    }
}

package Lambda;

public class Demo03Cook {
    public static void main(String[] args) {
        //调用invokeCook,参数是cook接口
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭");
            }
        });

        //匿名内部类
        invokeCook(()->{
            System.out.println("吃饭");
        });
    }

    //定义一个方法传递Cook接口，方法内部调用Cook接口中的方法makeCook
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}

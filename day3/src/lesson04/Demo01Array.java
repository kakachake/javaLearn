package lesson04;


/*
* 定义一个数组用来存储三个对象
* */
public class Demo01Array {

    public static void main(String[] args) {
        //首先创建一个长度为三的数组，里面用来存放person类型的对象

        Person[] array = new Person[3];
        System.out.println(array[0]);//null

        array[0] = new Person("迪丽热巴", 18);
        array[1] = new Person("古力娜扎", 20);
        array[2] = new Person("邓紫棋",27);
        for(int i = 0; i < array.length; i++ ){
            System.out.println( array[i].getName()+' '+array[i].getAge());
        }
    }

}

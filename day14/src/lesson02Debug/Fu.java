package lesson02Debug;

/*
 * 子父类的异常：
 *   -如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或者父类异常的子类或者不抛出异常
 *   -父类方法没有抛出异常，子类重写父类方法时也不可抛出异常，此时子类产生该异常，只能捕获处理，不能声明抛出
 * 注意:
 *     父类异常什么样，子类异常什么样
 * */
public class Fu {
    public  void  show01() throws NullPointerException, ClassCastException{

    }

    public  void  show02() throws IndexOutOfBoundsException{

    }


    public  void  show03(){

    }
}

class zi extends Fu {
    @Override
    //子类重写父类方法时，抛出和父类相同的异常
    public void show01() throws NullPointerException, ClassCastException {
        super.show01();
    }

    @Override
    //子类重写父类方法时，抛出和父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException {
        super.show02();
    }

    //或者不抛出异常


    @Override
    //父类方法没有抛出异常，子类重写父类方法时也不可抛出异常
    public void show03(){
        super.show03();
        try{
            throw  new Exception("抛出异常");
        }catch (Exception e){

        }
    }
}

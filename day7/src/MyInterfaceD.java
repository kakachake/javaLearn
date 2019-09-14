public interface MyInterfaceD {

    public abstract void methodD();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("DDD default");
    }

}

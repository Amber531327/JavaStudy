package Interface_jdk8new;

public interface A {
    //默认方法，使用default修饰，使用类的对象调用
    default void moren(){
        System.out.println("默认方法");
        siyou();
    }
    //私有方法，private修饰，jdk9开始才会有，只能在接口内部调用
    private void siyou(){
        System.out.println("私有方法");
    }
    //静态方法，static修饰，必须用当前接口名调用
    static void jingtai(){
        System.out.println("静态方法");
    }
}

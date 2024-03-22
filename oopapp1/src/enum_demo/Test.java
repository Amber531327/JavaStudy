package enum_demo;

public class Test {
    public static void main(String[] args) {
        A x=A.X;
        System.out.println(x);
        //A a=new A();枚举类是私有的，不能对外创建对象
        //枚举类的一些API
        A[] arr = A.values();//拿到全部对象
        A a3=A.valueOf("Z");
        System.out.println(a3.name());//Z
        System.out.println(a3);
        System.out.println(a3.ordinal());//索引
        System.out.println("------------------");
        B b=B.X;
        b.go();
        b.setAge(90);
        System.out.println(b.getAge());
        B b1=B.Y;
        b1.go();
    }
    
}

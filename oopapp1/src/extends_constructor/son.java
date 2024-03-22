package extends_constructor;

public class son extends fatheer{
    public son(){
        //默认是super()调用父类的无参构造器
        System.out.println("子类的无参构造器");
    }
    public son(int age){
        //默认是super()调用父类的无参构造器
        super(28);
        System.out.println("son:"+age);
    }
}

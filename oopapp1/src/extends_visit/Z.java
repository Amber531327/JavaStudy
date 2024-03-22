package extends_visit;

public class Z extends F {
    String name="子类名称";
    public void showName(){
        String name="局部变量";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    @Override
    public void print1(){
        System.out.println("子类的print1");
    }
    public void showMethod(){
        print1();
        super.print1();
    }
}

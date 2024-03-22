package Interface_demo;

public class Test {
    public static void main(String[] args) {
        People p=new People();
        p.drive();
    }
}
//alt+enter可以快速重写抽象方法
class People implements Driver,Teacher{

    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void teach() {
        System.out.println("teach");
    }
}
interface Driver{
    String name="amber";//默认常量
    void drive();//默认是抽象方法
}
interface Teacher{
    void teach();
}

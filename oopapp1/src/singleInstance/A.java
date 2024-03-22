package singleInstance;

public class A {
    //2.定义一个类变量记住类的一个对象
    private static A a=new A();
    //1.把类构造器私有
    private A(){

        }
    //定义一个类方法返回对象
    public static A getObject(){
        return a;
    }
}

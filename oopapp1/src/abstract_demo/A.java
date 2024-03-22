package abstract_demo;

public abstract class A {
    public abstract void run();
    String name;

}
class B extends A{

    @Override
    public void run() {
        System.out.println("pao");
    }
}

package extends_demo;

public class A {
    private int score;
    private void print1(){
        System.out.println("print1");
    }//私有方法在整个类当中都可以访问
    public String name;
    public void print2(){
        System.out.println("print2");
        print1();
        score=90;
    }

}

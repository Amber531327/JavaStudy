package polymorphism;

public class Student extends People{
    public String name="这是people的名称";
    @Override
    public void run(){
        System.out.println("学生跑步");
    }
    public void test(){
        System.out.println("学生要考试");
    }
}

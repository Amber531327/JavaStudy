package polymorphism;

public class Teacher extends People{
    public String name="这是teacher的名称";
    @Override
    public void run(){
        System.out.println("老师跑步");
    }
    public void teach(){
        System.out.println("老师要教书");
    }
}

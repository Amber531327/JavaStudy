package static_block;

public class Student {
    static int score;
    String name;
    //静态代码块
    static {
        score=80;
        System.out.println("score:"+score);
        System.out.println("静态代码块执行了");
    }
    //实例代码块
    {
        System.out.println("创建了新的对象" + this);
    }
    public Student(){
        System.out.println("无参构造器执行了");
    }
    public  Student(String name){
        this.name=name;
        System.out.println("有参构造器执行了");
    }
}

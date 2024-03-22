package extends_constructor;

public class test {
    public static void main(String[] args) {
        son s=new son();
        son s1=new son(20);//注意这里如果不在子类构造里使用super(...)调用的其实是父类的无参构造器
    }
}

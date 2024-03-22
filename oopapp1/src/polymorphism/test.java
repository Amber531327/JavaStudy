package polymorphism;

public class test {
    public static void main(String[] args) {
        People p1=new Student();
        People p2=new Teacher();
        p1.father();
        p1.run();
        p2.run();//行为：编译看左边，运行看右边
        p1.name="haa";//如果name是类变量那么p1.name和p2.name相同
        System.out.println(p1.name);
        System.out.println(p2.name);//变量：编译看左边，运行看左边
        Student s=new Student();
        go(s);//使用父类类型的变量作为方法的形参时，可以接收一切子类对象。
        Teacher t=new Teacher();
        go(t);
        //p1.test();多态下不能直接调用子类的独有方法
        System.out.println("-------------------");
        //强制类型转化,解决多态下不能调用子类独有方法的问题
        Teacher t1=(Teacher) p2;
        t1.teach();
        //Teacher t2=(Teacher) p1;会报错：.ClassCastException
        go(p1);
        go(p2);
    }
    public static void go(People p){
        if (p instanceof Student){
            Student s1=(Student) p;
            s1.test();
        }else {
            Teacher t1=(Teacher) p;
            t1.teach();
        }
    }
}

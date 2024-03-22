package staticdemo;

public class Test {
    public static void main(String[] args) {
        Student.name="jjp";
        System.out.println(Student.name);
        Student s1=new Student();
        Student s2=new Student();
        //一般不推荐这样引用类变量
        s1.name="amber";
        s2.name="doris";
        System.out.println(s1.name);//输出的是doris
        s1.age=15;
        s2.age=18;
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}

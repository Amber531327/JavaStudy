package constructor;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        Teacher t2=new Teacher(20,"amber");
        t1.name="doris";
        t1.age=30;
        System.out.println(t1.name+t1.age);
        System.out.println(t2.name+t2.age);
        return;
    }
}

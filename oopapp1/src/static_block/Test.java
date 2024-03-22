package static_block;


public class Test {
    public static void main(String[] args) {
        Student.score=90;
        System.out.println(Student.score);
        System.out.println(Student.score);
        System.out.println(Student.score);
        Student s1=new Student();
        Student s2=new Student("amber");
        System.out.println(s2.name);
    }
}

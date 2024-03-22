package javabean;


public class test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setScore(80);
        s1.setName("amber");
        Operator operator=new Operator(s1);
        operator.printPass();
    }
}

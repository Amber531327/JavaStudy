package javabean;

public class Operator {
    private Student student;

    public Operator(Student student) {
        this.student = student;
    }
    public void printPass(){
        if (student.getScore()>80){
            System.out.println("已经合格");
        }else {
            System.out.println("不合格");
        }
    }
}

package oop;

public class Student {
    String name;
    double Chinese;
    double English;
    public void printChinese(){
        System.out.println(name+"的语文成绩为："+Chinese);
    }
    public void printAverageScores(){
        System.out.println(name+"的平均成绩为："+(Chinese+English)/2);
    }
}

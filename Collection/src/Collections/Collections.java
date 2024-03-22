package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        Student s1=new Student("haha",24,147);
        Student s2=new Student("baba",23,143);
        Student s3=new Student("heeh",27,120);
        //批量添加数据
        java.util.Collections.addAll(students,s1,s2,s3);
        System.out.println(students);
        //打乱
        java.util.Collections.shuffle(students);
        System.out.println(students);
        //用学生类的方法来排序
        java.util.Collections.sort(students);
        System.out.println(students);
        //用comparator对象来排序
        java.util.Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getHeight()-o2.getHeight();
            }
        });
        System.out.println(students);

    }
}

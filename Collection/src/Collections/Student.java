package Collections;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int height;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }


}

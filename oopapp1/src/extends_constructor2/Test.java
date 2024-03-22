package extends_constructor2;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher("wo",20);
        Teacher t1=new Teacher("ba",39,"华南理工");
        System.out.println(t);
        System.out.println(t1);
    }
}
class Teacher{
    //实现了如果不定义schoolname就默认是暨南大学的功能
    String name;
    int age;
    String shcoolName;

    @Override
    public String toString() {
        return name+"的年龄为："+age+"学校为："+shcoolName;
    }

    public Teacher(String name, int age) {
        this.name=name;
        this.age=age;
        this.shcoolName="暨南大学";
    }

    public Teacher(String name, int age, String shcoolName) {
        this(name,age);
        this.shcoolName = shcoolName;
    }

    public String getName() {
        return name;
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

    public String getShcoolName() {
        return shcoolName;
    }

    public void setShcoolName(String shcoolName) {
        this.shcoolName = shcoolName;
    }
}

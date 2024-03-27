package ObjectOutputStreamandObjectInputStream;


import java.io.Serializable;
//要实现序列化就必须有接口
public class Student extends Object implements Serializable{
    private String name;
    //如果不想把数据进行序列化，那么在声明变量的时候加上transient修饰符
    private transient int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
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
    @Override
    public String toString(){
        return "name:"+name+"age:"+age;
    }
}


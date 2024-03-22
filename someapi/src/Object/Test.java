package Object;

import java.util.Objects;

public class Test {
    private int age;
    private String name;
    //都是右键generate生成的
    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    //不重写的话就是判断地址是否相同
    public boolean equals(Object o) {
        //判断地址是否相同
        if (this == o) return true;
        //判断地址是否为空，两者类型是否一样
        if (o == null || getClass() != o.getClass()) return false;
        //强转
        Test test = (Test) o;
        //内容是否一样
        return age == test.age && Objects.equals(name, test.name);
    }

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Test() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

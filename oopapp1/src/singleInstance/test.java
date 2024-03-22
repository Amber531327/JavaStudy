package singleInstance;

public class test {
    public static void main(String[] args) {
        A a1=A.getObject();
        A a2=A.getObject();
        System.out.println(a1);
        System.out.println(a2);
        //两个所指对象为同一个
    }
}

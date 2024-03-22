import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age=sc.nextInt();
        System.out.println("Your age is"+age);
        System.out.println("请输入你的姓名：");
        String name=sc.next();
        System.out.println("Your name is:"+name);
    }
}

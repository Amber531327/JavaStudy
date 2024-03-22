package ExceptionHandle;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //避免输入dskds这样的乱码
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("请输入合法的数据");
            }
        }
    }
    public static double getMoney(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入价格：");
            double money=sc.nextDouble();
            if (money>=0){
                return money;
            }else {
                System.out.println("价格不合适");
            }
        }
    }
}

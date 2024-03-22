import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //静态初始化数组
        int[] ages={1,2,3,4,5};
        //ages.fori回车
        for (int i = 0; i < ages.length; i++) {
         System.out.println(ages[i]);
        }
        //动态初始化数组
        int[] scores=new int[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("情输入分数：");
            int score=sc.nextInt();
            scores[i]=score;
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}

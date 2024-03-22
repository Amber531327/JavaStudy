package Simple;

import java.util.Scanner;

public class huiwen9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(787));
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字");
        int x=sc.nextInt();
        System.out.println(isPalindrome1(x));
    }

    public static boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        StringBuilder str1=new StringBuilder(str);
        String str3=str1.toString();
        StringBuilder str2=str1.reverse();
        if (str3.equals(str2.toString())){
            return true;
        }
        else return false;
    }
    public static boolean isPalindrome1(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        int ReversedNum=0;
        if (x<0||(x!=0&&x%10==0)){
            return false;
        }else {
            while (x>ReversedNum){
                ReversedNum=ReversedNum*10+x%10;
                x/=10;
            }
        }
        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。

        return x==ReversedNum||x==ReversedNum/10;
    }
}

package ParamTest;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        para(1);
        para(1,2,3);
        para(new int[] {7,8,9,10});

    }
    public static void para(int...nums){
        System.out.println(nums.length);
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("-----------------");
    }
}

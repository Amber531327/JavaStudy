package Simple.quyuhe303;

public class test {
    public static void main(String[] args) {
        int[] nums={2,3,4,5,6,7};
        //不能直接用quyuhe303 q=new quyuhe303({2,3,4,5,6,7});
        quyuhe303 q=new quyuhe303(nums);
        System.out.println(q.sumRange(0, 2));
    }
}

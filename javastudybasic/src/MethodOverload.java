public class MethodOverload {
    //一个类中，出现多个方法名称相同，但是它们的形参列表是不同的，那么这些方法叫做方法重载
    public static void main(String[] args) {
       test();
       test(50);
    }
    public static void test(){
        System.out.println("ssss");
    }
    public static void test(int a){
        System.out.println("sssss"+a);
    }
    //形参列表不同指的是：形参的个数、类型、顺序不同，不关注形参的名称
    void test(double c){
        System.out.println("ttttt");
    }

}

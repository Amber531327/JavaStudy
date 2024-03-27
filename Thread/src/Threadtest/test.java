package Threadtest;

public class test {
    //主线程和子线程执行是随机的
    public static void main(String[] args) {
        Thread t=new MyThread0();
        //注意是调用start不是调用run
        t.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("主线程正在输出：" + i);
        }
    }
}

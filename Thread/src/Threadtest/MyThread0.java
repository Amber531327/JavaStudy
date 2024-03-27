package Threadtest;

public class MyThread0 extends Thread{
    //必须重写run方法
    //run方法描述线程的执行内容
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程正在输出：" + i);
        }
    }
}

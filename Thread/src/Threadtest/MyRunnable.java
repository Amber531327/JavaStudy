package Threadtest;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程1输出:" + i);
        }
    }
}

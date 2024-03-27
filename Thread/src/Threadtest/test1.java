package Threadtest;

public class test1 {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();//多态
        new Thread(runnable).start();

        //简化形式1：匿名内部类
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    System.out.println("子线程2输出:" + i);
                }
            }
        };
        new Thread(runnable1).start();



        //简化形式2：匿名内部类(不创建变量)
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    System.out.println("子线程3输出:" + i);
                }
            }
        }).start();


        //简化形式3：匿名内部类(lambda表达式)
        new Thread(()-> {
                for (int i = 0; i < 4; i++) {
                    System.out.println("子线程3输出:" + i);
                }
            }
        ).start();



        for (int i = 0; i < 4; i++) {
            System.out.println("主线程输出:" + i);
        }
    }
}

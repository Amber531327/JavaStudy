package Threadtest;

public class test3 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号线程");
        // t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName()); // Thread-0（默认）

        Thread t2 = new MyThread("2号线程");
        // t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName()); // Thread-1

        // 主线程对象的名字
        // 哪个线程执行它，它就会得到哪个线程对象。
        Thread m = Thread.currentThread();//得到的是主线程的名字
        m.setName("最牛的线程");
        System.out.println(m.getName()); // main

        for (int i = 1; i <= 5; i++) {
            System.out.println(m.getName() + "线程输出：" + i);
        }
    }
}

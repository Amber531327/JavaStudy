package Threadtest;


public class MyThread extends Thread{
    public MyThread(String name){
        super(name); // 为当前线程设置名字了,因为Thread是当前类的父类，所以可以用父类的构造器设置名字
    }
    @Override
    public void run() {
        // 哪个线程执行它，它就会得到哪个线程对象。
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println(t.getName() + "输出：" + i);
        }
    }
}

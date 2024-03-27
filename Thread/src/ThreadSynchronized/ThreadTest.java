package ThreadSynchronized;

public class ThreadTest {
    public static void main(String[] args) {
        Account acc1=new Account("1234",100000);
        Account acc=new Account("123456",100000);
        Thread thread1 = new DrawThread(acc, "小明");
        thread1.start();
        Thread thread2 = new DrawThread(acc, "小红");
        thread2.start();

        Thread thread3 = new DrawThread(acc1, "小黑");
        thread3.start();
        Thread thread4 = new DrawThread(acc1, "小白");
        thread4.start();
    }
}

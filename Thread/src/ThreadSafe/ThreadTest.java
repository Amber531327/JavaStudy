package ThreadSafe;

public class ThreadTest {
    public static void main(String[] args) {
        Account acc=new Account("123456",100000);
        Thread thread1 = new DrawThread(acc, "小明");
        thread1.start();
        Thread thread2 = new DrawThread(acc, "小红");
        thread2.start();
    }
}

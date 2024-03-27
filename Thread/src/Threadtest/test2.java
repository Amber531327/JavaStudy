package Threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test2 {
    public static void main(String[] args) throws Exception {
        // 3、创建一个Callable的对象
        Callable<String> cl=new MyCallable(100);
        // 4、把Callable的对象封装成一个FutureTask对象（任务对象）
        // 未来任务对象的作用？
        // 1、是一个任务对象，实现了Runnable对象.
        // 2、可以在线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后的结果。
        FutureTask<String> ft=new FutureTask<>(cl);
        // 5、把任务对象交给一个Thread对象
        Thread t=new Thread(ft);
        t.start();
        // 6、获取线程执行完毕后返回的结果。
        // 注意：如果执行到这儿，假如上面的线程还没有执行完毕
        // 这里的代码会暂停，等待上面线程执行完毕后才会获取结果。
        System.out.println(ft.get());
    }
}

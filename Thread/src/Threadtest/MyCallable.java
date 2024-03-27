package Threadtest;

import java.util.concurrent.Callable;
//要使用泛型来指定返回的结果类型
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=i;
        }
        return "结果是："+sum;
    }
}

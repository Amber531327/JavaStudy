package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//一般不用，还是用ThreadPoolExecutor
public class Test {
    public static void main(String[] args) {
        //ctrl+shift+esc
        // 计算密集型的任务：核心线程数量 = CPU的核数 + 1
        // IO密集型的任务：核心线程数量 = CPU核数 * 2
        ExecutorService pool = Executors.newFixedThreadPool(3);//// 创建固定线程数量的线程池
        ExecutorService pool1 = Executors.newSingleThreadExecutor();//创建只有一个线程的线程池对象
        ExecutorService pool2 = Executors.newCachedThreadPool();//创建一个线程数量随着任务增加而增加
    }
}

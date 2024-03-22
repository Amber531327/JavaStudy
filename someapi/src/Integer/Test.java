package Integer;

import java.io.IOException;
import java.util.ArrayList;

public class Test {
    //包装类的使用
    public static void main(String[] args) throws IOException, InterruptedException {
        //把基本数据类型转化为对象
        Integer a1=Integer.valueOf(22);
        System.out.println(a1);
        //自动装箱：自动把基本数据类型数据转化为对象
        Integer a2=12;
        //自动拆箱：自动把包装类型的对象转换为相应的基本数据类型
        int a3=a2;
        //泛型和集合不支持基本数据类型，只能支持引用数据类型
        ArrayList<Integer> list =new ArrayList<>();
        list.add(11);//自动装箱
        int rs=list.get(0);//自动拆箱
        Runtime r=Runtime.getRuntime();
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory() / 1024.0 / 1024.0+"MB");
        System.out.println(r.freeMemory()/ 1024.0 / 1024.0+"MB");
        Process p=r.exec("C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
        Thread.sleep(5000);
        p.destroy();
    }
}

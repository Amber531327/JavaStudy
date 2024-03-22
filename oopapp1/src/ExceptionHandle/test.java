package ExceptionHandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        //优化：全部改成Exception
        try {
            test1();
        } catch (ParseException e) {
            System.out.println("解析的时间有问题");
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到");
            throw new RuntimeException(e);
        }
    }
    public static void test1() throws ParseException, FileNotFoundException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //alt+enter快捷抛出
        Date d=sdf.parse("2028-11-11 10:25:36");
        System.out.println(d);
        test2();
    }
    public static void test2() throws FileNotFoundException {
        InputStream is=new FileInputStream("D:/yxj.png");
    }
}

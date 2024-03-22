package Date;

import java.text.ParseException;
import java.util.Date;

public class SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println(d);

        long time=d.getTime();
        System.out.println(time);

        java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss 星期：EEE 上午/下午：a");
        String rs= sdf.format(d);
        String rs2= sdf.format(time);
        System.out.println(rs);
        System.out.println(rs2);

        System.out.println("-------------------------------");
        String dataSrt="2024-01-01 00:00";
        java.text.SimpleDateFormat sdf2= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date d2=sdf2.parse(dataSrt);
        System.out.println(d2);
        Date d3=new Date();
        System.out.println((d3.getTime()-d2.getTime())/1000/3600/24);

    }
}

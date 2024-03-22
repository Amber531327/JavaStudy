package Date;

import java.util.Date;

public class Traditional {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        long time= d.getTime();
        time+=2*1000;
        Date d1=new Date(time);
        System.out.println(d1);
    }
}

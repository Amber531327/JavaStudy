package ExceptionTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest1 {
    public static void main(String[] args) throws ParseException{
        //ctrl+alt+t
//        try {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d=sdf.parse("2028-11-11 10:25");
            System.out.println(d);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

    }
}

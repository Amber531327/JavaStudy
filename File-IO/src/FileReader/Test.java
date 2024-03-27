package FileReader;

import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
        try (
                FileReader reader = new FileReader("File-IO\\fileoutput.txt");
        ){
//            int c;
//            while ((c= reader.read())!=-1){
//                System.out.print((char) c);
//            }
            char[] buffer = new char[3];
            int len;
            while ((len= reader.read(buffer))!=-1){
                System.out.print(new String(buffer, 0, len));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package FileInputStream;

import java.io.IOException;
import java.io.InputStream;

public class FileInputStream {
    public static void main(String[] args) throws IOException {
        //读一个字节
        InputStream is=new java.io.FileInputStream("E:\\programming\\JAVA\\study\\winter\\File-IO\\test");
        InputStream is1=new java.io.FileInputStream("E:\\programming\\JAVA\\study\\winter\\File-IO\\test");
        InputStream is2=new java.io.FileInputStream("E:\\programming\\JAVA\\study\\winter\\File-IO\\test");

        int b1=is.read();
        System.out.println((char) b1);

        //用buffer读多个字节
        byte[] buffer = new byte[3];
        int len;
        while ((len=is1.read(buffer))!=-1){
            String s = new String(buffer, 0, len);
            System.out.print(s);
        }
        System.out.println();
        //使用readAllBytes
        byte[] buffer1 = is2.readAllBytes();
        System.out.println(new String(buffer1));

        is.close();
        is1.close();
        is2.close();

    }
}

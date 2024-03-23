package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
    public static void main(String[] args) throws IOException {
        //覆盖数的管道
        FileOutputStream os1 = new FileOutputStream("File-IO//fileoutput.txt");
        //追加数据的管道
        FileOutputStream os2= new FileOutputStream("File-IO//fileoutput1.txt", true);

        //写字节数据
        os1.write(97);
        os1.write('b');//用单引号
        byte[] bytes = "我爱你中国".getBytes();
        os1.write(bytes);
        os1.write(bytes,0,9);//utf-8每一个汉字占三个字节

        os2.write(bytes,0,9);

        //换行符
        os2.write("\r\n".getBytes());

        os2.close();




        os1.close();
    }
}

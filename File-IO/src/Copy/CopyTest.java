package Copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("File-IO/fileoutput.txt");
        FileOutputStream os= new FileOutputStream("File-IO/fileoutputcopy.txt");
        //只要没有创建新的流就不会覆盖

        //不用is.readAllbytes()是因为可能复制的文件可能会特别大
        byte[] buffer = new byte[1024];
        int len;
        while ((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        os.close();
        is.close();
        System.out.println("文件覆盖完成");

    }
}

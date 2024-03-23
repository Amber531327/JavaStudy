package trycatchfinally;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        //ctrl alt t
        FileInputStream is = new FileInputStream("File-IO/fileoutput.txt");
        FileOutputStream os= new FileOutputStream("File-IO/fileoutputcopy.txt");
        try {
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //避免局部变量报错
            //避免在还没创建os和is之前就已经出错
            try {
                if (os!=null) os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(is!=null) is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

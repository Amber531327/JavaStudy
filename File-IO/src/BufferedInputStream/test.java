package BufferedInputStream;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        try (

                FileInputStream is = new FileInputStream("File-IO/fileoutput.txt");
             FileOutputStream os= new FileOutputStream("File-IO/fileoutputcopy1.txt");
                InputStream bis=new BufferedInputStream(is);
                OutputStream bos=new BufferedOutputStream(os);
             )
        {

            //只要没有创建新的流就不会覆盖

            //不用is.readAllbytes()是因为可能复制的文件可能会特别大
            byte[] buffer = new byte[1024];
            int len;
            while ((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            bos.close();
            bis.close();
            System.out.println("文件覆盖完成");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

package InputStreamReader;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try (
                //获取文件原始字节流
                InputStream is=new FileInputStream("File-IO\\gbk");
                //转成字符输入流
                Reader isr=new InputStreamReader(is,"GBK");
                //用缓冲输入流提高性能
                BufferedReader br=new BufferedReader(isr);

                )
        {
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

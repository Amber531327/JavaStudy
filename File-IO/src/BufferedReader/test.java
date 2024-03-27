package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class test {
    public static void main(String[] args) {
        try (
                FileReader reader = new FileReader("File-IO\\fileoutput.txt");
                BufferedReader br=new BufferedReader(reader);//readline是特有方法所以不能用多态
        ){
//            int c;
//            while ((c= reader.read())!=-1){
//                System.out.print((char) c);
//            }
            char[] buffer = new char[3];
            int len;
//            while ((len= br.read(buffer))!=-1){
//                System.out.print(new String(buffer, 0, len));
//            }
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);//返回的就是字符串
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

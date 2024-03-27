package OutputStreamWriter;

import java.io.*;

public class test {
    public static void main(String[] args) {
        try (
                OutputStream os=new FileOutputStream("File-IO\\outgbk.txt");
                Writer osw=new OutputStreamWriter(os,"GBK");
                BufferedWriter bw=new BufferedWriter(osw);
                ){
            bw.write("hahahaha");
            bw.newLine();
            bw.write("dshds");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

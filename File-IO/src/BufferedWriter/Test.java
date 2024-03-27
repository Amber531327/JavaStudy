package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test {
    public static void main(String[] args) {
        try (
                //参数多加一个true就是增添了
                FileWriter fileWriter = new FileWriter("File-IO\\BufferedWriter.txt");
                BufferedWriter bw=new BufferedWriter(fileWriter);
        )
        {
            bw.write("c");
            bw.write(97);
            bw.write("woaini",0,2);//代表由两个字符

            bw.newLine();

            char[] chars={'a','b','c'};
            bw.write(chars);
            bw.write(chars,0,2);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

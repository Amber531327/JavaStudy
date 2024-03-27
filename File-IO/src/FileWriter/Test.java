package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try (
                //参数多加一个true就是增添了
                FileWriter fileWriter = new FileWriter("File-IO\\FileWriter.txt");
                )
        {
            fileWriter.write("c");
            fileWriter.write(97);
            fileWriter.write("woaini",0,2);//代表由两个字符
            char[] chars={'a','b','c'};
            fileWriter.write(chars);
            fileWriter.write(chars,0,2);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package PrintWriterandPrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class test {
    public static void main(String[] args) {
        try (
                PrintWriter pw=new PrintWriter("File-IO\\print.txt");
                PrintStream ps=new PrintStream(new FileOutputStream("File-IO\\prints.txt",true));
                )
        {
          pw.println("hahaaa");
          pw.println(7);
          pw.write(98);
          ps.println(78);
          ps.write(99);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

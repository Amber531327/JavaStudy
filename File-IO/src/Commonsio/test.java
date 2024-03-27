package Commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("File-IO\\fileoutput.txt"),new File("File-IO\\commonsio.txt"));
//        FileUtils.copyDirectory();
//        FileUtils.deleteDirectory();
    }
}

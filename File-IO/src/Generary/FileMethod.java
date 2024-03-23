package Generary;

import java.io.File;

public class FileMethod {
    public static void main(String[] args) {
        File f=new File("E:\\programming\\JAVA\\study\\winter");
        System.out.println(f.getName());
        System.out.println(f.lastModified());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
    }


}

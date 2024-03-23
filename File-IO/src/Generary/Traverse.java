package Generary;

import java.io.File;

public class Traverse {
    public static void main(String[] args) {
        File f1=new File("E:\\programming\\JAVA\\study\\winter");
        //只能得到一级名称
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}

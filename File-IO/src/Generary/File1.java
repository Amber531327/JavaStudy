package Generary;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File f1 =new java.io.File("C:\\Users\\Amber\\Pictures\\Screenshots");
        System.out.println(f1.length());
        System.out.println(f1.exists());//也可以指向空的文件

    }
}

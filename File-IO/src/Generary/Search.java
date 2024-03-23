package Generary;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        File f1=new File("E:\\");
        String filename="创新任务申请书(1).doc";
        SearchFile(f1,filename);

    }
    public static void SearchFile(File dir,String filename){
        if (dir==null||!dir.exists()||dir.isFile()){
            return;
        }
        File[] files = dir.listFiles();
        System.out.println(Arrays.toString(files));
        if(files!=null){
            for (File file : files) {
                if (file.isFile()){
                    if (file.getName().contains(filename)){
                        System.out.println("find:" + file.getAbsolutePath());
                    }
                }else {
                    SearchFile(file,filename);
                }
            }
        }
    }

}

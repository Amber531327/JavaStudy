package ObjectOutputStreamandObjectInputStream;

import java.io.*;

public class test {
    public static void main(String[] args) {
        try(
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("File-IO\\oos.txt"));
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream("File-IO\\oos.txt"));
        ) {
            Student s=new Student("haha",78);
            oos.writeObject(s);
            Student s1=(Student) ois.readObject();//强转
            System.out.println(s1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

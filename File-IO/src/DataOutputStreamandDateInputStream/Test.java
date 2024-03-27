package DataOutputStreamandDateInputStream;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try (
                DataOutputStream dos=new DataOutputStream(new FileOutputStream("File-IO\\data.txt"));
                DataInputStream dis=new DataInputStream(new FileInputStream("File-IO\\data.txt"))
                ){
                //把数据和其类型一并写出去
                dos.writeInt(77);
                dos.writeDouble(23.2);
                dos.writeUTF("dsds");

                //必须要按顺序读
                dis.readInt();
                dis.readDouble();
                dis.readUTF();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

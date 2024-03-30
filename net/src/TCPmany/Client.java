package TCPmany;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1、创建Socket对象，并同时请求与服务端程序的连接。
        Socket socket = new Socket("127.0.0.1", 8888);
        // 2、从socket通信管道中得到一个字节输出流，用来发数据给服务端程序。
        OutputStream os = socket.getOutputStream();
        // 3、把低级的字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("请输入");
            String msg = sc.nextLine();
            if ("exit".equals(msg)){
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
            System.out.println("已经发送成功");
        }
        dos.close();//会自动把os也关了
        socket.close();


    }
}

package TCPmanysend;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("-----服务端启动成功-------");
        // 1、创建ServerSocket的对象，同时为服务端注册端口。
        ServerSocket serverSocket = new ServerSocket(8888);

        // 2、使用serverSocket对象，调用一个accept方法，等待客户端的连接请求

        while (true) {
            Socket socket = serverSocket.accept();//注意这里才创建了两者的通道
            new ClientBuildThread(socket).start();
        }


    }
}

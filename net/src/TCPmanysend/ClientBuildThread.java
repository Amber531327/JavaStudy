package TCPmanysend;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientBuildThread extends Thread{
    private Socket socket;

    public ClientBuildThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(socket.getRemoteSocketAddress() + "上线了");
            while (true) {
                try {
                    String s = socket.getRemoteSocketAddress()+"发送了："+dis.readUTF();
                    System.out.println(s);
                } catch (Exception e) {
                    System.out.println(socket.getRemoteSocketAddress() + "下线了！");
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

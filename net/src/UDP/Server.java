package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        //先启动服务端再启动客户端
        System.out.println("----服务端启动----");
        // 1、创建一个服务端对象（创建一个接韭菜的人） 注册端口
        DatagramSocket socket = new DatagramSocket(6666);
        // 2、创建一个数据包对象，用于接收数据的（创建一个韭菜盘子）
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
        while (true) {
            // 3、开始正式使用数据包来接收客户端发来的数据
            socket.receive(datagramPacket);
            // 4、从字节数组中，把接收到的数据直接打印出来
            // 接收多少就倒出多少
            // 获取本次数据包接收了多少数据。
            System.out.println(datagramPacket.getLength());
            String s = new String(buffer, 0, datagramPacket.getLength());
            System.out.println(s);

            System.out.println(datagramPacket.getAddress().getHostAddress());
            System.out.println(datagramPacket.getPort());
            System.out.println("----------------------------------------");
        }




    }
}

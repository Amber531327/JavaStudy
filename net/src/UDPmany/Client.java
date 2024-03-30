package UDPmany;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //创建客户端对象（发韭菜出去的人）
        DatagramSocket socket = new DatagramSocket();//实现多个客户端就不要加端口号，让它随机生成
        // 2、创建数据包对象封装要发出去的数据（创建一个韭菜盘子）
       /* public DatagramPacket(byte buf[], int length,
             InetAddress address, int port)
               参数一：封装要发出去的数据。
               参数二：发送出去的数据大小（字节个数）
               参数三：服务端的IP地址（找到服务端主机）
               参数四：服务端程序的端口。
             */
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个数据：");
            String msg=sc.nextLine();
            byte[] bytes = msg.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 6666);//在本地上客户端和服务端都是本地主机
            // 3、开始正式发送这个数据包的数据出去了
            socket.send(datagramPacket);

            System.out.println("客户端数据发送完毕~~~");
            if (msg.equals("exit")){
                System.out.println("已经退出程序");
                socket.close();
                break;
            }
        }

    }
}

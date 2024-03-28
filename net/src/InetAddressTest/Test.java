package InetAddressTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws Exception {
        //1/获取本机IP地址对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());

        //获取指定IP地址或者域名的IP地址对象
        InetAddress p1 = InetAddress.getByName("10.45.92.11");
        InetAddress p2 = InetAddress.getByName("www.bilibili.com");
        System.out.println(p1.getHostName());
        System.out.println(p1.getHostAddress());
        System.out.println("--------------");
        System.out.println(p2.getHostName());
        System.out.println(p2.getHostAddress());

        //ping  www.
        System.out.println(p2.isReachable(6000));

    }
}

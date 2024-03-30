package Proxy1;

public class Test {
    public static void main(String[] args) {
        BigStar star=new BigStar("王晓佳");
        Star starProxy=ProxyUtil.createProxy(star);
        String re=starProxy.sing("单向镜面");
        System.out.println(re);
        starProxy.dance();
    }
}

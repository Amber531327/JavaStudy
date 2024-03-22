package StringBuilder;

public class test {
    public static void main(String[] args) {
//        String str="abc";
//        for (int i = 0; i < 1000000; i++) {
//            str=str+"abc";
//        }运行速度很慢
        StringBuilder sb=new StringBuilder("abc");
        for (int i = 0; i < 100000; i++) {

            sb.append("abc");
        }
        System.out.println(sb);//运行速度很快
    }
}

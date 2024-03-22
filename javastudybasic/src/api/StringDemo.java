package api;

public class StringDemo {
    public static void main(String[] args) {
        String str="amber is me";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        char [] chars=str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        String s1="ababa";
        String s2="ababa";
        String s3="Ababa";
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        //左闭右开
        System.out.println(str.substring(0, 6));
        System.out.println(str.substring(6));
        //注意replace并不会改变原本的内容
        System.out.println(str.replace("amber", "doris"));
        System.out.println(str.contains("is"));
        System.out.println(str.startsWith("do"));
        String man="abby,anna,amber,doris";
        String[] manArray=man.split(",");
        for (int i = 0; i < manArray.length; i++) {
            System.out.println(manArray[i]);
        }

    }
}

package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
            method();
    }
    public static void method(){
        String data="电话：18081553731\n"+
                "邮箱：251915161@qq.com\n"+
                "qq:251915161";
        //定义爬取规则
        String regex = "1[3|4|5|8][0-9]\\d{8}|[A-Za-z0-9_]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}|[1-9]\\d{4,10}";

        //把正则表达式封装成一个Pattern对象
        Pattern pattern=Pattern.compile(regex);
        //通过Pattern对象去获取查找内容的匹配对象
        Matcher matcher= pattern.matcher(data);
        //定义一个循环开始爬取信息
        while (matcher.find()){
            String rs= matcher.group();
            System.out.println(rs);
        }
    }
}

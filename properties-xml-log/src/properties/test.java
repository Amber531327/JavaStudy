package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class test {
    public static void main(String[] args) throws Exception {
        //从属性文件中读取
        //先存到properties对象里面然后再load
        Properties properties = new Properties();
        properties.load(new FileReader("properties-xml-log\\src\\users.properties"));
        System.out.println(properties.getProperty("好啊"));
        Set<String> keys=properties.stringPropertyNames();
        for (String key : keys) {
            System.out.println(properties.getProperty(key));
        }
        properties.forEach((k,v)->{
            System.out.println(k + "---->" + v);
        });
        //把键值对写出到属性文件里去
        Properties properties1 = new Properties();
        properties1.setProperty("amber","0531");
        properties1.store(new FileWriter("properties-xml-log\\src\\users.properties",true),"这是一个必须写的注释，没有也要写null");


    }
}

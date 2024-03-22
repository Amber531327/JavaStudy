package MapTraverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Traverse {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("haha",2);
        map.put("bubu",3);
        map.put("gugu",1);
        //键找值
        Set<String> set = map.keySet();
        for (String s : set) {
            int value=map.get(s);
            System.out.println(s + "----->" + value);
        }
        System.out.println("---------------");
        //map.entrySet()后ctrl+alt+v 键值对
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "----->" + value);
        }
        System.out.println("------------------------");
        //Lambda表达式
        map.forEach((k,v)->{
            System.out.println(k + "------->" + v);
        });
    }


}

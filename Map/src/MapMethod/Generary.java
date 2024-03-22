package MapMethod;

import java.util.*;

public class Generary {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("haha",2);
        map.put("bubu",3);
        map.put("gugu",1);
        System.out.println(map);
//        map.clear();
        System.out.println(map.size());
        map.isEmpty();
        System.out.println(map.get("haha"));
        System.out.println(map.remove("haha"));
        System.out.println(map.containsKey("bubu"));
        System.out.println(map.containsValue(2));
        Set<String> s = map.keySet();
        System.out.println(s);
        Collection<Integer> v = map.values();
        System.out.println(v);

    }

}
